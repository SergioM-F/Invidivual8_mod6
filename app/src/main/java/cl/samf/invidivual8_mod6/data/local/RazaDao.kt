package cl.samf.invidivual8_mod6.data.local

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

interface RazaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRaza(razaEntity: RazaEntity)

    @Query("select * from tabla_raza order by raza desc")
    fun getRazas() : LiveData<RazaEntity>
}