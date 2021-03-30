package com.example.notesapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var List: MutableList<Data> = ArrayList()

    var name1: String? = null
    var id1: String?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val exs = Data(name1, id1)
        List.add(exs)
        var adapter = adapter()
        recycler.adapter = adapter

        float_button.setOnClickListener {
            var intent = Intent(this, add_item::class.java)
            name1 = intent.extras?.getString("name")
            id1 = intent.extras?.getString("id")
            startActivity(intent)





        }
    }


}