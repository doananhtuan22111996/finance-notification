package com.feature.business.data.di

import com.feature.business.data.NotificationApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.converter.gson.GsonConverterFactory
import vn.core.data.di.AnoRetrofitApiService
import vn.core.data.di.ProviderModule.provideRetrofit
import vn.core.provider.finance.Configs
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal class NetworkModule {

    @Provides
    @Singleton
    @AnoRetrofitApiService
    fun provideApiServices(
        okHttpClient: OkHttpClient,
        gsonConverterFactory: GsonConverterFactory,
    ): NotificationApiService = provideRetrofit<NotificationApiService>(
        baseUrl = Configs.MAIN_DOMAIN,
        okHttpClient = okHttpClient,
        gsonConverterFactory = gsonConverterFactory,
    )
}
