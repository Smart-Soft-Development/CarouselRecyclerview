package com.jackandphantom.carousellayout

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.customviewimple.model.DataModel
import com.jackandphantom.carousellayout.adapter.DataAdapter
import com.jackandphantom.carousellayout.adapter.SimpleAdapter
import com.jackandphantom.carouselrecyclerview.SnapHelperOneByOne
import com.jackandphantom.carouselrecyclerview.CarouselRecyclerview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carouselRecyclerview = findViewById<CarouselRecyclerview>(R.id.recycler)

        val list = ArrayList<DataModel>()
        list.add(DataModel(R.drawable.hacker, "Thi is cool"))
        list.add(DataModel(R.drawable.hobes, "Thi is cool"))
        list.add(DataModel(R.drawable.guypro, "Thi is cool"))
        list.add(DataModel(R.drawable.joker, "Thi is cool"))
        list.add(DataModel(R.drawable.londonlove, "Thi is cool"))

        val adapter = DataAdapter(list)

        carouselRecyclerview.adapter = adapter
        carouselRecyclerview.set3DItem(true)
        carouselRecyclerview.setAlpha(true)
        val linearSnapHelper = SnapHelperOneByOne()
        linearSnapHelper.attachToRecyclerView(carouselRecyclerview)

        val carouselLayoutManager = carouselRecyclerview.getCarouselLayoutManager()
        val currentlyCenterPosition = carouselRecyclerview.getSelectedPosition()

        carouselLayoutManager.scrollToPosition(4)


    }
}