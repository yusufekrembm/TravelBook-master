package com.yusufekrem.landmark_book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yusufekrem.landmark_book.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        val intent = intent
        val selectedLandMark = intent.getSerializableExtra("landmark") as Data

        binding.imageView.setImageResource(selectedLandMark.image)
        binding.textView.text = selectedLandMark.name
        binding.textView2.text = selectedLandMark.country







    }















}