package cl.samf.invidivual8_mod6.data.local

import androidx.room.Entity



@Entity(tableName = "tabla_razas_detalle", primaryKeys = ["perro_detalle", "url"])
data class DetalleRazaEntity (
    val perro_detalle: String,
    val url: String
)
