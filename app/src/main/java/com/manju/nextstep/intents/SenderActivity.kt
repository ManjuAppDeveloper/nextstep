package com.manju.nextstep.intents

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.manju.nextstep.R
import com.manju.nextstep.databinding.ActivitySenderBinding

class SenderActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySenderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySenderBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.sendBtn.setOnClickListener{
            val intent = Intent(this,ReceiverActivity::class.java)
            intent.putExtra("stringValue","Hello")
            intent.putExtra("intValue",123)
            intent.putExtra("booleanValue",true)
            intent.putExtra("floatValue",1.12f)
            intent.putExtra("doubleValue",7.12)
            intent.putExtra("longValue",789L)
            intent.putExtra("charValue",'M')
            startActivity(intent)
        }
    }
}