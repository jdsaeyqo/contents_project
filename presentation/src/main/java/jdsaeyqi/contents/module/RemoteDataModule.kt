package jdsaeyqi.contents.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jdsaeyqi.contents.util.AccessTokenInterceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteDataModule {

    @Provides
    @Singleton
    fun provideInterceptor() : HttpLoggingInterceptor{
        return HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(
        xAccessTokenInterceptor : AccessTokenInterceptor
    ) : OkHttpClient{
        return OkHttpClient.Builder().addNetworkInterceptor(xAccessTokenInterceptor).build()
    }

}