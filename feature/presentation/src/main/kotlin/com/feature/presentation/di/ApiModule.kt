package com.feature.presentation.di

import androidx.compose.runtime.Composable
import com.feature.api.NotificationApi
import com.feature.presentation.ui.NotificationPage
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ApiModule {

    @Provides
    @Singleton
    fun provideNotificationApi(): NotificationApi = object : NotificationApi {

        @Composable
        override fun NotificationView() {
            NotificationPage()
        }
    }
}