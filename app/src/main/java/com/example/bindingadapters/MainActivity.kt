package com.example.bindingadapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.bindingadapters.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val post = Post("Studying","Learning Binding Adapters","https://m.media-amazon.com/images/I/21jNQiAlH8L._SX425_.jpg")
        binding.post = post
    }
}