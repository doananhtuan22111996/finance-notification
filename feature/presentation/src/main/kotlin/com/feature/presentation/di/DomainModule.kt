package com.feature.presentation.di

import com.feature.business.domain.repository.GetNotificationRepository
import com.feature.business.domain.usecase.GetNotificationUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    @ViewModelScoped
    fun provideGetNotificationUseCase(repository: GetNotificationRepository): GetNotificationUseCase = GetNotificationUseCase(repository)
}
