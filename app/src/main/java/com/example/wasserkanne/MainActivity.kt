package com.example.wasserkanne

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.wasserkanne.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val kannenListe = Datasource().loadkannen()
        val recyclerView = binding.kannenListe
        recyclerView.adapter = KannenAdapter(kannenListe)
        recyclerView.setHasFixedSize(true)
    }
}