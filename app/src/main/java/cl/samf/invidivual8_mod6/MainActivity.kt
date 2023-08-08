package cl.samf.invidivual8_mod6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
/*
[] 2 pantallas: listado y detalle
[x] Permiso Internet
[x] dependencias: viewBinding, coil, room, retrofit, navigation, viewmodel
[] Listado:
    [] RecyclerView + ViewHolder + Adapter
[] Detalle:
    [] Recyclerview + ViewHolder + Adapter
[] repositorio
[] Remoto
    [] dataClass
    [] API (Interface)
    [] RetroFit
[] Local
    [] Database
    [] Entity
    [] DAO
*/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}