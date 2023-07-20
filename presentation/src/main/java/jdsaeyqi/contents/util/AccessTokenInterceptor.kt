package jdsaeyqi.contents.util

import jdsaeyqi.contents.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

class AccessTokenInterceptor() : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request =
            chain.request().newBuilder().addHeader("Authorization", BuildConfig.TOKEN).build()
        return chain.proceed(request)
    }
}