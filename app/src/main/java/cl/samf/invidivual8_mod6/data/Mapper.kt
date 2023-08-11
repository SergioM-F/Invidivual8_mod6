package cl.samf.invidivual8_mod6.data

import cl.samf.invidivual8_mod6.data.local.DetalleRazaEntity
import cl.samf.invidivual8_mod6.data.local.RazaEntity

fun String.toEntity(id: String): DetalleRazaEntity = DetalleRazaEntity(id, this)

fun String.toRazaEntity(): RazaEntity = RazaEntity(this)
