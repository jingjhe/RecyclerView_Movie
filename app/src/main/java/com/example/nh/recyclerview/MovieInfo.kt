package com.example.nh.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import com.example.nh.data.Movie
import kotlinx.android.synthetic.main.activity_movie_info.*

class MovieInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_info)
        supportActionBar!!.hide()
        val movie = intent.getParcelableExtra<Movie>("movie")
        titleTv.text = movie.title
        Glide.with(this).load(movie.poster_path).placeholder(R.drawable.load)
            .into(posterImg)
        Glide.with(this).load(movie.poster_path).placeholder(R.drawable.load)
            .into(backdropImg)
    }

    fun backBtnOnClick(view: View) {
        overridePendingTransition(R.anim.enter_from_left, R.anim.exit_to_right)
        super.onBackPressed()
    }
}
