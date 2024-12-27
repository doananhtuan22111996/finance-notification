package com.feature.presentation.ui

import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.feature.business.domain.model.NotificationModel
import com.feature.business.domain.usecase.GetNotificationUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class NotificationViewModel @Inject constructor(getNotificationUseCase: GetNotificationUseCase) :
    ViewModel() {

    val localScrollState by mutableStateOf(LazyListState())

    val paging: Flow<PagingData<NotificationModel>> =
        getNotificationUseCase.execute(params = arrayOf(1)).cachedIn(viewModelScope)
}