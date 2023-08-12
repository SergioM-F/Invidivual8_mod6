package cl.samf.invidivual8_mod6.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface RazaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRaza (razaEntity: RazaEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRaza (razaEntity: List<RazaEntity>)

    @Query("select * from tabla_raza order by raza ASC")
    fun getRazas() : LiveData<List<RazaEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDetallePerro (detalleRazaEntity: DetalleRazaEntity)

    @Query("select * from tabla_razas_detalle where perro_detalle like :id")
    fun getRazasDetalle(id :String) : LiveData<List<DetalleRazaEntity>>
}