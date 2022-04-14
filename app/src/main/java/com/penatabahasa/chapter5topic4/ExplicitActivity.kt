package com.penatabahasa.chapter5topic4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.penatabahasa.chapter5topic4.databinding.ActivityExplicitBinding

class ExplicitActivity : AppCompatActivity() {
    private lateinit var binding: ActivityExplicitBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExplicitBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}