package com.manju.nextstep.Quiz.com.manju.nextstep.Routines
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.manju.nextstep.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import androidx.lifecycle.lifecycleScope
class GlobalScopeActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gsa_layout)
        lifecycleScope.launch {
            showToast("Its beginning")
            delay(2000L)
            showToast("After 2 seconds")
            delay(2000L)
            showToast("After 4 seconds")
        }
    }

    private fun showToast(s: String) {
        runOnUiThread{
            Toast.makeText(this.applicationContext,s,Toast.LENGTH_SHORT).show()

        }
    }
}