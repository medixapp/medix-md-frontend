package com.example.medix.ui.welcome

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.medix.databinding.ActivityWelcomeBinding
import com.example.medix.ui.signup.SignUpActivity

class WelcomeActivity : AppCompatActivity() {
    private var binding: ActivityWelcomeBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding =ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.btnWelcome?.setOnClickListener{
            startActivity(Intent(this, SignUpActivity::class.java))
        }

    }
}