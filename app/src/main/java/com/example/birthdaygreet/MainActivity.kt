package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Toast.makeText
import com.example.birthdaygreet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun createBirthdayCard(view: View) {
        val name = binding.nameInput.editableText.toString()
        //makeText(this,"Button was clicked , $name", Toast.LENGTH_LONG).show()
        val intent = Intent(this,birthdayCard::class.java)
        intent.putExtra(birthdayCard.NAME_EXTRA,name)
        startActivity(intent)
    }

}