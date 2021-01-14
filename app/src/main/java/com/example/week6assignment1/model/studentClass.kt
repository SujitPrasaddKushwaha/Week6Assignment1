package com.example.week6assignment1.model

import android.os.Parcel
import android.os.Parcelable

class studentClass(
    val imageprofile: String? = null,
    val name: String? = null,
    val age: String? = null,
    val address: String? = null,
    val gender: String? = null
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(imageprofile)
        parcel.writeString(name)
        parcel.writeString(age)
        parcel.writeString(address)
        parcel.writeString(gender)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<studentClass> {
        override fun createFromParcel(parcel: Parcel): studentClass {
            return studentClass(parcel)
        }

        override fun newArray(size: Int): Array<studentClass?> {
            return arrayOfNulls(size)
        }
    }
}