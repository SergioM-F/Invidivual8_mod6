package cl.samf.invidivual8_mod6.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tabla_raza")

class RazaEntity (
    @PrimaryKey(autoGenerate = true) var id: Long,
            val raza: String

)