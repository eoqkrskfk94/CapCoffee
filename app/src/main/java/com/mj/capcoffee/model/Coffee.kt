package com.mj.capcoffee.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.mj.capcoffee.datas.CoffeeItem
import kotlinx.android.parcel.Parcelize

data class Coffee (val imageResourse: String,
                   @SerializedName("capsule_name") val capsuleName : String,
                   val intensity: Int,
                   val intensityImage: String,
                   val ristretto: Int,
                   val espresso: Int,
                   val lungo: Int,
                   val roasting: Int,
                   val bitterness: Int,
                   val sourness: Int,
                   val body: Int,
                   @SerializedName("side_name") val sideName: String,
                   @SerializedName("side_title") val sideTitle: String,
                   val description1: String,
                   val description2: String,
                   val description3: String,
                   val description4: String,
                   val description5: String,
                   val capType: String,
                   @SerializedName("com_image1") val comImage1: String,
                   @SerializedName("com_image2") val comImage2: String,
                   @SerializedName("com_image3") val comImage3: String) : Parcelable {


    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(imageResourse)
        parcel.writeString(capsuleName)
        parcel.writeInt(intensity)
        parcel.writeString(intensityImage)
        parcel.writeInt(ristretto)
        parcel.writeInt(espresso)
        parcel.writeInt(lungo)
        parcel.writeInt(roasting)
        parcel.writeInt(bitterness)
        parcel.writeInt(sourness)
        parcel.writeInt(body)
        parcel.writeString(sideName)
        parcel.writeString(sideTitle)
        parcel.writeString(description1)
        parcel.writeString(description2)
        parcel.writeString(description3)
        parcel.writeString(description4)
        parcel.writeString(description5)
        parcel.writeString(capType)
        parcel.writeString(comImage1)
        parcel.writeString(comImage2)
        parcel.writeString(comImage3)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Coffee> {
        override fun createFromParcel(parcel: Parcel): Coffee {
            return Coffee(parcel)
        }

        override fun newArray(size: Int): Array<Coffee?> {
            return arrayOfNulls(size)
        }
    }





}