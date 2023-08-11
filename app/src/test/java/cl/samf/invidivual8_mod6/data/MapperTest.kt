package cl.samf.invidivual8_mod6.data

import org.junit.Assert.*

import org.junit.Test

class MapperTest {

    @Test
    fun toEntity() {
        //Given (dado este valor)
        val url = "http://example.com"
        val id = "datoId"

        //When (hago esto)
        val resultadoTransformacion = url.toEntity(id)

        //Then, (espero esto)
        assertEquals(id, resultadoTransformacion.perro_detalle)
        assertEquals(url, resultadoTransformacion.url)
    }

    @Test
    fun toRazaEntity() {
        //Given (dado este valor)
        val raza = "raza"

        //When (hago esto)
        val resultadotransf = raza.toRazaEntity()

        //Then, (espero esto)
        assertEquals(raza, resultadotransf.raza)
    }
}