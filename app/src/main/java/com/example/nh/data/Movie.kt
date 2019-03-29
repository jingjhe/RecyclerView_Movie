package com.example.nh.data

import android.os.Parcel
import android.os.Parcelable

class Movie(val id: Int, val title: String, val poster_path: String):Parcelable {
    constructor(id: Int, title: String) : this(id, title, "")


    var vote_count: Int? = null
    var vote_average: Short? = null
    var popularity: Double? = null
    var original_title = null
    var original_language = null
    var backdrop_path = null
    var adult: Boolean? = null
    var video: Boolean? = null

    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    ) {
        vote_count = parcel.readValue(Int::class.java.classLoader) as? Int
        vote_average = parcel.readValue(Short::class.java.classLoader) as? Short
        popularity = parcel.readValue(Double::class.java.classLoader) as? Double
        adult = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        video = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(title)
        parcel.writeString(poster_path)
        parcel.writeValue(vote_count)
        parcel.writeValue(vote_average)
        parcel.writeValue(popularity)
        parcel.writeValue(adult)
        parcel.writeValue(video)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Movie> {
        override fun createFromParcel(parcel: Parcel): Movie {
            return Movie(parcel)
        }

        override fun newArray(size: Int): Array<Movie?> {
            return arrayOfNulls(size)
        }
    }
}