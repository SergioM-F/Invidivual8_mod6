package cl.samf.invidivual8_mod6.data.remote

import retrofit2.Response
import retrofit2.http.GET

interface RazaApi {
    @GET("breeds/list/all")
    suspend fun getData(): Response<RazaPerritos>
}