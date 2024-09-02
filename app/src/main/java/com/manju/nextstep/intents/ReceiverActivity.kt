package com.manju.nextstep.intents
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.manju.nextstep.R
class ReceiverActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receiver)
        val stringData=intent.getStringExtra("stringValue")
        val intData=intent.getIntExtra("intValue",0)
        val booleanData=intent.getBooleanExtra("booleanValue",false)
        val floatData=intent.getFloatExtra("floatValue",0.0f)
        val doubleData=intent.getDoubleExtra("doubleValue",0.0)
        val longExtra=intent.getLongExtra("longValue",0L)
        val charData=intent.getCharExtra("charValue",'A')
    }
}