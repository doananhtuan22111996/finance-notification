package com.feature.presentation.di

import androidx.compose.runtime.Composable
import com.feature.api.NotificationApi
import com.feature.presentation.ui.NotificationPage
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped

@Module
@InstallIn(ActivityRetainedComponent::class)
class ApiModule {

    @Provides
    @ActivityRetainedScoped
    fun provideNotificationApi(): NotificationApi = object : NotificationApi {

        @Composable
        override fun Page() {
            NotificationPage()
        }
    }
}