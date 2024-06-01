package com.example.medix.ui.medication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.medix.databinding.ActivityMedicationBinding

class MedicationActivity : AppCompatActivity() {
    private var binding: ActivityMedicationBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMedicationBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setSupportActionBar(binding?.topBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}