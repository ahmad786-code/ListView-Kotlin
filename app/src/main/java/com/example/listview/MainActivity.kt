package com.example.listview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView

    private val items = arrayOf(
        "Item 1",
        "Item 2",
        "Item 3",
        "Item 4",
        "Item 1",
        "Item 2",
        "Item 3",
        "Item 4",
        "Item 1",
        "Item 2",
        "Item 3",
        "Item 4",
        "Item 1",
        "Item 2",
        "Item 3",
        "Item 4",
        "Item 1",
        "Item 2",
        "Item 3",
        "Item 4",
        "Item 2",
        "Item 3",
        "Item 4",
        "Item 1",
        "Item 2",
        "Item 3",
        "Item 4"


    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.ListItem)

        val adapter = ArrayAdapter<String>(
            applicationContext,
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            items
        )

        listView.adapter = adapter

        listView.setOnItemClickListener { adapterView, view, i, l ->
            val valueSelected = listView.getItemAtPosition(i).toString()
            Toast.makeText(applicationContext, valueSelected, Toast.LENGTH_LONG).show()
        }

    }
}