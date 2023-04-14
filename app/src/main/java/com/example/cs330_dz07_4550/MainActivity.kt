package com.example.cs330_dz07_4550

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.CheckBoxPreference
import android.preference.EditTextPreference
import android.preference.Preference
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = fragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragment1 = PrviFragment()



        fragmentTransaction.replace(android.R.id.content, fragment1)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

//    fun testing() {
//        val txt = findViewById<TextView>(R.id.rezultat)
//        txt.text = "cao"
//    }
}