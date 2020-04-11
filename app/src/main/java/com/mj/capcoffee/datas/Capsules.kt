package com.mj.capcoffee.datas

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Capsules")
class Capsules(@PrimaryKey(autoGenerate = true) var id: Int?,
               @ColumnInfo(name = "Capsulename") var CapName: String?,
               @ColumnInfo(name = "CapsuleImage") var CapImage: Int?,
               @ColumnInfo(name = "Intensity") var CapIntensity: Int?,
               @ColumnInfo(name = "IntensityImage") var CapIntenImage: Int?
               ) {

}