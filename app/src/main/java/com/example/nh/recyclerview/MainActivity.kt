package com.example.nh.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.View
import com.example.nh.adapter.ContactAdapter
import com.example.nh.data.Movie
import com.example.nh.model.MovieModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private var arrayList = ArrayList<Movie>()
    private var listType = MovieModel.LIST_TYPE_LIST
    lateinit var layoutManager: RecyclerView.LayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layoutManager = LinearLayoutManager(this)
        loadingData()
        doRecyclerView()
    }

    private fun loadingData() {
        arrayList.add(Movie(1, "驯龙高手3", "http://velmm.com/images/bottom_navigationview/dunkirk.jpg"))
        arrayList.add(Movie(2, "nate", "http://velmm.com/images/bottom_navigationview/thor_ragnarok.jpg"))
        arrayList.add(Movie(3, "驯龙高手3", "http://velmm.com/images/bottom_navigationview/star_war.jpg"))
        arrayList.add(Movie(4, "dfe", "http://velmm.com/images/bottom_navigationview/lion.png"))
        arrayList.add(Movie(5, "tdfjklm", "http://velmm.com/images/bottom_navigationview/wonder.jpg"))
        arrayList.add(Movie(6, "tdfom", "http://velmm.com/images/bottom_navigationview/dunkirk.jpg"))
        arrayList.add(Movie(7, "驯龙高手3", "http://velmm.com/images/bottom_navigationview/coco.jpg"))
        arrayList.add(Movie(8, "terij", "http://velmm.com/images/bottom_navigationview/lion.png"))
        arrayList.add(Movie(9, "mie", "http://velmm.com/images/bottom_navigationview/coco.jpg"))
        arrayList.add(Movie(10, "驯龙高手3", "http://velmm.com/images/bottom_navigationview/dunkirk.jpg"))
        arrayList.add(Movie(11, "eofj", "http://velmm.com/images/bottom_navigationview/wonder.jpg"))
        arrayList.add(Movie(12, "el", "http://velmm.com/images/bottom_navigationview/dunkirk.jpg"))
        arrayList.add(Movie(13, "tm", "http://velmm.com/images/bottom_navigationview/coco.jpg"))
        arrayList.add(Movie(14, "驯龙高手3", "http://velmm.com/images/bottom_navigationview/wonder.jpg"))
    }

    private fun doRecyclerView() {
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = ContactAdapter(this, arrayList, listType)
    }

    fun listTypeChanged(view: View) {
        when (view.id) {
            streamImgBtn.id -> {
                layoutManager = LinearLayoutManager(this)
                listType = MovieModel.LIST_TYPE_COVER
            }
            listImgBtn.id -> {
                layoutManager = LinearLayoutManager(this)
                listType = MovieModel.LIST_TYPE_LIST
            }
            moduleImgBtn.id -> {
                layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
                listType = MovieModel.LIST_TYPE_MODULE

            }
        }
        doRecyclerView()
    }
}
