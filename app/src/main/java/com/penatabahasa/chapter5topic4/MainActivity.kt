package com.penatabahasa.chapter5topic4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.penatabahasa.chapter5topic4.data.Email
import com.penatabahasa.chapter5topic4.data.User
import com.penatabahasa.chapter5topic4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnExplicit.setOnClickListener {
                val intent = Intent(this@MainActivity, ExplicitActivity::class.java)
                startActivity(intent)
            }

            btnImplicit.setOnClickListener {
                val phoneNumber = "081210841382"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }

            btnBundle.setOnClickListener {
                val intent = Intent(this@MainActivity, ReceiverActivity::class.java)
                val bundle = Bundle()
                bundle.putString("type", "Intent with Bundle")
                intent.putExtras(bundle)
                startActivity(intent)
            }

            btnSerializable.setOnClickListener {
                val user = User("Serializable Intent")
                val intent = Intent(this@MainActivity, SerializableActivity::class.java)
                intent.putExtra("TYPE", user)
                startActivity(intent)
            }

            btnParcelable.setOnClickListener {
                val email = Email(email = "jaja@gmail.com")
                val intent = Intent(this@MainActivity, ParcelableActivity::class.java)
                intent.putExtra("EMAIL", email)
                startActivity(intent)
            }
        }
    }
}