package com.manju.nextstep.UserManage

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.manju.nextstep.R
import com.manju.nextstep.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
     var username:String=""
     var password:String=""
     var conformPassword:String=""
     var contactNum:Long=0
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPreferences=getSharedPreferences("user_manage",Context.MODE_PRIVATE)
        retrieveUserData()
        binding.edtUserName.setText(username)
        binding.edtPassword.setText(password)

    }

    private fun retrieveUserData() {
         username = sharedPreferences.getString("username", "")!!
         password = sharedPreferences.getString("password", "")!!
         conformPassword = sharedPreferences.getString("conformPassword", "")!!
         contactNum = sharedPreferences.getLong("contactNum", 0)
    }
}