package com.example.couponsapplication.authentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.couponsapplication.R
import com.example.couponsapplication.databinding.ActivitySigninBinding

class SigninActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySigninBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySigninBinding.inflate(layoutInflater)

        setContentView(binding.root)


    }
}