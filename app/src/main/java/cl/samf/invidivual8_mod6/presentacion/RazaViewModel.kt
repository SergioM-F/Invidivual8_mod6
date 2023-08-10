package cl.samf.invidivual8_mod6.presentacion

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import cl.samf.invidivual8_mod6.data.Repositorio
import cl.samf.invidivual8_mod6.data.local.RazaDataBase
import cl.samf.invidivual8_mod6.data.remote.PerritoRetrofit
import kotlinx.coroutines.launch

class RazaViewModel(application: Application): AndroidViewModel(application) {

    private val repositorio: Repositorio

    fun razaLiveData() = repositorio.obtenerRazaEntity()

    fun detalleLiveData(id: String) = repositorio.obtenerDetalleEntity(id)
    init {
        val razaApi = PerritoRetrofit.getRetrofitRaza()
        val razaDataBase = RazaDataBase.getDatabase(application).getRazaDao()
        repositorio = Repositorio(razaApi, razaDataBase)
    }

    fun getRaza() = viewModelScope.launch{
        repositorio.getRazas()
    }

    fun getDetalleRaza(id: String) = viewModelScope.launch {
        repositorio.obtenerDetalleRaza(id)
    }



}


