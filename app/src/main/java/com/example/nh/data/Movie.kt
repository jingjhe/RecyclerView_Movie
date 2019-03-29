package com.example.nh.data

class Movie(val id: Int, val title: String, val poster_path: String) {
    constructor(id: Int, title: String) : this(id, title, "")


    var vote_count: Int? = null
    var vote_average: Short? = null
    var popularity: Double? = null
    var original_title = null
    var original_language = null
    var backdrop_path = null
    var adult: Boolean? = null
    var video: Boolean? = null
}