package com.example.nh.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.nh.data.Movie
import com.example.nh.model.MovieModel
import com.example.nh.recyclerview.R
import kotlinx.android.synthetic.main.listitem_movie_list.view.*
import kotlinx.android.synthetic.main.listitem_movie_module.view.*
import kotlinx.android.synthetic.main.listitem_movie_stream.view.*

class ContactAdapter(
    private val context: Context,
    private val movieList: ArrayList<Movie>,
    private val listType: Int
) :
    RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): MyViewHolder {
        val view: View = when (listType) {
            MovieModel.LIST_TYPE_COVER -> {
                LayoutInflater.from(context).inflate(R.layout.listitem_movie_stream, parent, false)
            }
            MovieModel.LIST_TYPE_MODULE -> {
                LayoutInflater.from(context).inflate(R.layout.listitem_movie_module, parent, false)
            }
            MovieModel.LIST_TYPE_LIST -> {
                LayoutInflater.from(context).inflate(R.layout.listitem_movie_list, parent, false)
            }
            else -> {
                LayoutInflater.from(context).inflate(R.layout.listitem_movie_list, parent, false)
            }
        }

        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        when (listType) {
            MovieModel.LIST_TYPE_LIST -> {
                holder.listMovieBind(context, movieList[position])
            }
            MovieModel.LIST_TYPE_MODULE -> {
                holder.moduleMovieBind(context, movieList[position])
            }
            MovieModel.LIST_TYPE_COVER -> {
                holder.streamMovieBind(context, movieList[position])
            }
        }
    }


}

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun listMovieBind(context: Context, movie: Movie) {
        itemView.movieNameList.text = "Movie Name:${movie.title}"
        //itemView.idTv.text= "Movie Rated:${contact.id}"
        Glide.with(context).load(movie.poster_path).placeholder(R.drawable.load)
            .into(itemView.listImg)

    }

    fun moduleMovieBind(context: Context, movie: Movie) {
        itemView.movieNameModule.text=movie.title
        Glide.with(context).load(movie.poster_path).placeholder(R.drawable.load)
            .into(itemView.moduleImg)
    }

    fun streamMovieBind(context: Context, movie:Movie) {
        itemView.movieNameStream.text=movie.title
        Glide.with(context).load(movie.poster_path).placeholder(R.drawable.load)
            .into(itemView.streamImg)
    }

}