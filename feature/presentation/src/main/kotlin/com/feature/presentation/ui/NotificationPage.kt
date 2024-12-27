package com.feature.presentation.ui

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.collectAsLazyPagingItems
import com.feature.presentation.components.NotificationComponent
import vn.core.composex.uikit.paging.Paging

@Composable
fun NotificationPage() {
    val viewModel = hiltViewModel<NotificationViewModel>()
    val paging = viewModel.paging.collectAsLazyPagingItems()

    Paging(lazyPagingItems = paging, lazyListState = viewModel.localScrollState, items = { index ->
        val model = paging[index]
        model?.let {
            NotificationComponent(
                title = model.title, description = model.description, date = model.date
            )
        }
    })
}
