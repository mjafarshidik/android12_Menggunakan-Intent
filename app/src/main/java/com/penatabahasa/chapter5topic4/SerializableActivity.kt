package com.penatabahasa.chapter5topic4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.penatabahasa.chapter5topic4.data.User
import com.penatabahasa.chapter5topic4.databinding.ActivitySerializableBinding

class SerializableActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySerializableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySerializableBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = intent.getSerializableExtra("TYPE") as User
        val type = user.type
        binding.apply {
            tvSerializable.text = type
        }
    }
}