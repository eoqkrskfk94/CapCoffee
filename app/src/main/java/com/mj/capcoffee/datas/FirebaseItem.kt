package com.mj.capcoffee.datas

import android.os.Parcel
import android.os.Parcelable

data class FirebaseItem(val imageResourse: String?,
                   val capsule_name : String?,
                   val intensity: Int,
                   val intensityImage: String?,
                   val ristretto: Int,
                   val espresso: Int,
                   val lungo: Int,
                   val roasting: Int,
                   val bitterness: Int,
                   val sourness: Int,
                   val body: Int,
                   val side_name: String?,
                   val side_title: String?,
                   val description1: String?,
                   val description2: String?,
                   val description3: String?,
                   val description4: String?,
                   val description5: String?,
                   val capType: String?) : Parcelable {

    constructor(parcel : Parcel) : this(
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
        parcel.readString()
    ) {
    }

    constructor() : this("","",0,"",0,0,0,0,0,0,0,"","","","","","","","")

    override fun writeToParcel(parcel : Parcel, flags : Int) {
        parcel.writeString(imageResourse)
        parcel.writeString(capsule_name)
        parcel.writeInt(intensity)
        parcel.writeString(intensityImage)
        parcel.writeInt(ristretto)
        parcel.writeInt(espresso)
        parcel.writeInt(lungo)
        parcel.writeInt(roasting)
        parcel.writeInt(bitterness)
        parcel.writeInt(sourness)
        parcel.writeInt(body)
        parcel.writeString(side_name)
        parcel.writeString(side_title)
        parcel.writeString(description1)
        parcel.writeString(description2)
        parcel.writeString(description3)
        parcel.writeString(description4)
        parcel.writeString(description5)
        parcel.writeString(capType)
    }

    override fun describeContents() : Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<FirebaseItem> {
        override fun createFromParcel(parcel : Parcel) : FirebaseItem {
            return FirebaseItem(parcel)
        }

        override fun newArray(size : Int) : Array<FirebaseItem?> {
            return arrayOfNulls(size)
        }
    }


}