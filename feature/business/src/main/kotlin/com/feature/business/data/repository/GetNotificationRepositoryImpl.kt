package com.feature.business.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.feature.business.data.NotificationApiService
import com.feature.business.data.raw.NotificationRaw
import com.feature.business.domain.model.NotificationModel
import com.feature.business.domain.repository.GetNotificationRepository
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import vn.core.data.di.AnoRetrofitApiService
import vn.core.data.model.ListResponse
import vn.core.data.network.PagingByNetworkDataSource
import javax.inject.Inject

class GetNotificationRepositoryImpl @Inject constructor(@AnoRetrofitApiService private val apiService: NotificationApiService) : GetNotificationRepository {

    override fun getNotifications(page: Int): Flow<PagingData<NotificationModel>> = Pager(config = PagingConfig(pageSize = 15)) {
        object : PagingByNetworkDataSource<NotificationRaw, NotificationModel>() {
            override suspend fun onApi(page: Int?): Response<ListResponse<NotificationRaw>> = apiService.getNotifications(page = page ?: 1)

            override suspend fun processResponse(request: ListResponse<NotificationRaw>?): ListResponse<NotificationModel> = ListResponse(
                data = request?.data?.map { it.raw2Model() },
                metadata = request?.metadata,
            )
        }
    }.flow
}
