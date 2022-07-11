package com.example.cvmobileapp


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cvmobileapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate((layoutInflater))
        setContentView(binding.root);

        binding.cardBackground.setOnClickListener {
            val intent = Intent ( this, BackgroundActivity::class.java)
            startActivity((intent))
        }



    }

}




