package com.penatabahasa.chapter5topic4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.penatabahasa.chapter5topic4.databinding.ActivityReceiverBinding

class ReceiverActivity : AppCompatActivity() {
    private lateinit var binding: ActivityReceiverBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReceiverBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getBundleIntent()
    }

    private fun getBundleIntent() {
        binding.apply {
            val bundle = intent.extras
            val type = bundle?.getString("type")
            tvResult.text = type
        }
    }
}