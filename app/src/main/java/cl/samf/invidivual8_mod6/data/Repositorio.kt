package cl.samf.invidivual8_mod6.data

import cl.samf.invidivual8_mod6.data.local.RazaDao
import cl.samf.invidivual8_mod6.data.local.RazaEntity
import cl.samf.invidivual8_mod6.data.remote.RazaApi

class Repositorio(private val razaApi: RazaApi, private val razaDao: RazaDao) {

    suspend fun getRazas() {
        val response = razaApi.getData()
        if(response.isSuccessful){
            val message = response.body()!!.messaje //solo sacando la parte del message, sin datos
            val keys = message.keys
            keys.forEach {
                val razaEntity = RazaEntity(it)
                razaDao.insertRaza(razaEntity)
            }

        }
    }
}