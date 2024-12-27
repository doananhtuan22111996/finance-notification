package com.feature.business.data

import com.feature.business.data.raw.NotificationRaw
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import vn.core.data.model.ListResponse

interface NotificationApiService {

    @GET("/notifications")
    suspend fun getNotifications(@Query("page") page: Int = 1): Response<ListResponse<NotificationRaw>>
}