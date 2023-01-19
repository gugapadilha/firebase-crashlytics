package com.guga.firebasecrashlytics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.guga.firebasecrashlytics.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnButton.setOnClickListener {

            //could simulate a error when user click on button

        }
    }
}