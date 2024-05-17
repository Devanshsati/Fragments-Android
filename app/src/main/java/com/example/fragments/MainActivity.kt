package com.example.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragments.databinding.ActivityMainBinding
import com.example.fragments.fragment.BlankFragment1
import com.example.fragments.fragment.BlankFragment2
import com.example.fragments.fragment.DefaultFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var manager = supportFragmentManager
        var transaction = manager.beginTransaction()
        transaction.replace(R.id.frameLayout,DefaultFragment())
        transaction.commit()

        binding.button1.setOnClickListener {
            manager = supportFragmentManager
            transaction = manager.beginTransaction()
            transaction.replace(R.id.frameLayout,BlankFragment1())
            transaction.commit()
        }

        binding.button2.setOnClickListener {
            manager = supportFragmentManager
            transaction = manager.beginTransaction()
            transaction.replace(R.id.frameLayout, BlankFragment2())
            transaction.commit()
        }

    }
}