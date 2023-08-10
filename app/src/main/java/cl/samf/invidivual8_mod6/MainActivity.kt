package cl.samf.invidivual8_mod6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.samf.individual5_mod6.R


/*
[] 2 pantallas: listado y detalle
[x] Permiso Internet
[x] dependencias: viewBinding, coil, room, retrofit, navigation, viewmodel
[] Listado:
    [] RecyclerView + ViewHolder + Adapter
[] Detalle:
    [] Recyclerview + ViewHolder + Adapter
[x] repositorio
[x] Remoto
    [x] dataClass
    [x] API (Interface)
    [x] RetroFit
[x] Local
    [x] Database
    [x] Entity
    [x] DAO
*/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}