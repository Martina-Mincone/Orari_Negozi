package com.example.orari_new.accessoUtenti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.orari_new.R
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}