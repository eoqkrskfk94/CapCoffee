package com.mj.capcoffee.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
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





}