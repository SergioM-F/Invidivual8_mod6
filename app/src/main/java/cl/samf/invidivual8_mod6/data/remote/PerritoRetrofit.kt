package cl.samf.invidivual8_mod6.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class PerritoRetrofit {
    companion object {
        private const val URL_BASE ="https://dog.ceo/api"

        fun getRetrofitRaza(): RazaApi {
            val mRetrofit = Retrofit.Builder()
                .baseUrl(URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return mRetrofit.create(RazaApi::class.java)
        }
    }
}