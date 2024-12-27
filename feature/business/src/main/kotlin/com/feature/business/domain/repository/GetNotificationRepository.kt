package com.feature.business.domain.repository

import androidx.paging.PagingData
import com.feature.business.domain.model.NotificationModel
import kotlinx.coroutines.flow.Flow

interface GetNotificationRepository {
    fun getNotifications(page: Int = 1): Flow<PagingData<NotificationModel>>
}