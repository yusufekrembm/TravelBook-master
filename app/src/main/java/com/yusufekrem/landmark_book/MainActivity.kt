package com.yusufekrem.landmark_book

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.yusufekrem.landmark_book.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landMarkList : ArrayList<Data>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landMarkList = ArrayList<Data>()

        val downTown = Data("Down Town","California",R.drawable.dowtown)
        val istanbul = Data("Istanbul","Turkey",R.drawable.istanbul)
        val tokyo = Data("Tokyo","Japanese",R.drawable.tokyo)
        val newYork = Data("New York","USA",R.drawable.newyork)


        landMarkList.add(downTown)
        landMarkList.add(istanbul)
        landMarkList.add(tokyo)
        landMarkList.add(newYork)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landMarkAdapter = Adapter(landMarkList)
        binding.recyclerView.adapter = landMarkAdapter
    }













}