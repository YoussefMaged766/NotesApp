package com.example.notesapp

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity


import kotlinx.android.synthetic.main.item_add.*

class add_item: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_add)
    btn_save.setOnClickListener{
    var intent = Intent(this, MainActivity::class.java)
    intent.putExtra("name" , txtname.text.toString())
        intent.putExtra("id" , txtid.text.toString())
    startActivity(intent)

}
        }
    }
