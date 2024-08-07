package com.manju.nextstep.UserManage
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.manju.nextstep.R
import com.manju.nextstep.databinding.ActivitySignUpBinding
import com.manju.nextstep.intents.ReceiverActivity

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPreferences=getSharedPreferences("user_manage",Context.MODE_PRIVATE)
        binding.btnSignUp.setOnClickListener{
            saveData()
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }

    private fun saveData() {
        val username = binding.edtUserName.text.toString()
        val password = binding.edtPassword.text.toString()
        val conformPassword = binding.edtTlConformPassword.text.toString()
        val contactNum = binding.edtContactNum.text.toString().toLong()

        val editor = sharedPreferences.edit()
        editor.putString("username",username)
        editor.putString("password",password)
        editor.putString("conformPassword",conformPassword)
        editor.putLong("contactNum",contactNum)
        editor.apply()
    }
}