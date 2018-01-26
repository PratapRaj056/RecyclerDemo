package com.example.adt.demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var isBoolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<Adapter.AttData>()
        list.add(Adapter.AttData("VipLove", "90%"))
        list.add(Adapter.AttData("VipLove2", "90%"))
        list.add(Adapter.AttData("VipLove3", "90%"))
        list.add(Adapter.AttData("VipLove4", "90%"))
        list.add(Adapter.AttData("VipLove5", "90%"))
        recycler_view.adapter = Adapter(list)

        down.setOnClickListener{ onClickDown() }

        showHideRecycler()

    }

    private fun onClickDown(){
        if(recycler_view.visibility == View.VISIBLE){
            isBoolean = false
        }else if(recycler_view.visibility == View.GONE){
            isBoolean = true
        }

        showHideRecycler()

    }

    private fun showHideRecycler(){
        if(isBoolean){
            recycler_view.visibility = View.VISIBLE
            recycler_view.setHasFixedSize(true)

        }else{
            recycler_view.visibility = View.GONE
        }
    }
}
