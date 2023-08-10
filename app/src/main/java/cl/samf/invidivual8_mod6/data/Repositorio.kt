package cl.samf.invidivual8_mod6.data

import android.util.Log
import androidx.lifecycle.LiveData
import cl.samf.invidivual8_mod6.data.local.DetalleRazaEntity
import cl.samf.invidivual8_mod6.data.local.RazaDao
import cl.samf.invidivual8_mod6.data.local.RazaEntity
import cl.samf.invidivual8_mod6.data.remote.PerroDetalle
import cl.samf.invidivual8_mod6.data.remote.RazaApi

class Repositorio(private val razaApi: RazaApi, private val razaDao: RazaDao) {

    fun obtenerRazaEntity(): LiveData<List<RazaEntity>> = razaDao.getRazas()
    fun obtenerDetalleEntity(id: String): LiveData<List<DetalleRazaEntity>> = razaDao.getRazasDetalle(id)

    suspend fun getRazas() {
        val response = razaApi.getData()
        if (response.isSuccessful) {
            val message = response.body()!!.message //solo sacando la parte del message, sin datos
            val keys = message.keys
            keys.forEach {
                val razaEntity = RazaEntity(it)
                razaDao.insertRaza(razaEntity)
            }

        } else {
            Log.e("repositorio", response.errorBody().toString())
        }
    }
    suspend fun obtenerDetalleRaza(id: String){
        val response = razaApi.getDetallePerro(id)
        if(response.isSuccessful){
            response.body()!!.message.forEach{
                val detalleRazaEntity = DetalleRazaEntity(id,it)
                razaDao.insertDetallePerro(detalleRazaEntity)
            }

        }else{
            Log.e("repositorio", response.errorBody().toString())
        }
    }
}