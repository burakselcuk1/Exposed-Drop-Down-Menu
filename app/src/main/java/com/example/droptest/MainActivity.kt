package com.example.droptest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.droptest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }


    override fun onResume() {
        super.onResume()
        val genders = resources.getStringArray(R.array.gender)

        val arrayAdapter = ArrayAdapter(this,R.layout.drop_down_item,R.id.textView, genders)

        binding.burak.setAdapter(arrayAdapter)

    }
}