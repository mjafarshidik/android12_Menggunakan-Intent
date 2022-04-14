package com.penatabahasa.chapter5topic4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.penatabahasa.chapter5topic4.data.Email
import com.penatabahasa.chapter5topic4.databinding.ActivityParcelableBinding

class ParcelableActivity : AppCompatActivity() {
    private lateinit var binding: ActivityParcelableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParcelableBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val email = intent.getParcelableExtra<Email>("EMAIL")
        val resultEmail = email?.email

        binding.apply {
            tvParcelable.text = resultEmail
        }
    }
}