package com.example.todoappkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.todoappkotlin.databinding.ActivityLoginPageBinding


class LoginPageActivity : AppCompatActivity() {

    private lateinit var activityLoginbinding: ActivityLoginPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityLoginbinding = DataBindingUtil.setContentView(this, R.layout.activity_login_page)
        activityLoginbinding.login.setOnClickListener {
            val userName = activityLoginbinding.userName.text.toString()
            println(userName)
            val password = activityLoginbinding.password.text.toString()
            println(password)
            if(userName == "1" && password == "1"){
               val intent = Intent(this , HomePage::class.java)
                startActivity(intent)
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            }
        }
    }
}