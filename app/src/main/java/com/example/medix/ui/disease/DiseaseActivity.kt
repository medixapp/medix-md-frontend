package com.example.medix.ui.disease

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.medix.databinding.ActivityDiseaseBinding

class DiseaseActivity : AppCompatActivity() {
    private var binding: ActivityDiseaseBinding? =  null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDiseaseBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setSupportActionBar(binding?.topBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}