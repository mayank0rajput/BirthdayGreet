package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birthdaygreet.databinding.ActivityBirthdayCardBinding

class birthdayCard : AppCompatActivity() {
    lateinit var binding: ActivityBirthdayCardBinding
    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirthdayCardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra(NAME_EXTRA)


        binding.greet.text = "Happy Birthday \n $name !"
    }
}