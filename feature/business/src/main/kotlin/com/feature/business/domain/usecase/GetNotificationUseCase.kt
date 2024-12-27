package com.feature.business.domain.usecase

import androidx.paging.PagingData
import com.feature.business.domain.model.NotificationModel
import com.feature.business.domain.repository.GetNotificationRepository
import kotlinx.coroutines.flow.Flow
import vn.core.usecase.BaseUseCase
import javax.inject.Inject

class GetNotificationUseCase @Inject constructor(private val repository: GetNotificationRepository) :
    BaseUseCase<Int, PagingData<NotificationModel>>() {
    override fun execute(vararg params: Int?): Flow<PagingData<NotificationModel>> {
        return repository.getNotifications(page = params[0] ?: 1)
    }
}