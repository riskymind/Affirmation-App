package com.example.affirmationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.affirmationapp.adapter.ItemAdapter
import com.example.affirmationapp.data.DataSource
import com.example.affirmationapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataSet = DataSource().loadAffirmations()

        binding.recyclerView.apply {
            adapter = ItemAdapter(this@MainActivity, dataSet)
            setHasFixedSize(true)
        }

    }
}