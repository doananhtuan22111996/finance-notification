package com.feature.presentation.di

import com.feature.business.data.repository.GetNotificationRepositoryImpl
import com.feature.business.domain.repository.GetNotificationRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class DataModule {

    @Binds
    @ViewModelScoped
    abstract fun bindGetNotificationRepository(impl: GetNotificationRepositoryImpl): GetNotificationRepository
}