package com.example.androiduilist

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ListAdapter(private val context: Activity,private val resource:Int,private val arrayList: List<Model>): ArrayAdapter<Model>(context,R.layout.ui_list,arrayList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater: LayoutInflater=LayoutInflater.from(context)
        val view: View=inflater.inflate(resource,null)

        val uiName : TextView= view.findViewById(R.id.ui_name)
        val createdDate: TextView = view.findViewById(R.id.created_date)
        val statusIcon: ImageView=view.findViewById(R.id.status_icon)

        uiName.text = "${arrayList[position].id} . ${arrayList[position].pageName}"
        createdDate.text=arrayList[position].createdDate
        statusIcon.setImageResource(
            when(arrayList[position].status){
                0->R.drawable.not_started_icon
                1->R.drawable.progress_icon
                else -> R.drawable.completed
            }
        )
        return view
    }
}