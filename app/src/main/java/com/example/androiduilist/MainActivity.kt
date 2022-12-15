package com.example.androiduilist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pages=listOf<Model>(
            Model(
                1,
                "Login and SignUP",
                "15-12-2022",
                Intent(this,LoginPage::class.java),
                0
            ),
            Model(
                1,
                "Login and SignUP",
                "15-12-2022",
                Intent(this,LoginPage::class.java),
                0
            ),
        )

        val listView: ListView=findViewById(R.id.page_list)
        listView.adapter=ListAdapter(this,R.layout.ui_list,pages)
        listView.setOnItemClickListener{ parent: AdapterView<*>, view: View, position:Int, id:Long->
            startActivity(pages[position].intent)
        }
    }
}