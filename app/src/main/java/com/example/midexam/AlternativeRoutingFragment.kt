package com.example.midexam

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.midexam.Controller.RouteListAdapter
import kotlinx.android.synthetic.main.fragment_alternative_routing.view.*

class AlternativeRoutingFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_alternative_routing, container, false)
        val activity1 = activity as Context
        var recyclerView = view.alternate_route_recycler_view
        var adapter = RouteListAdapter(activity1)
        adapter.getRoutes()
        recyclerView.adapter =  adapter
        recyclerView.layoutManager = LinearLayoutManager(activity1)
        recyclerView.setHasFixedSize(true)
        //Log.e("ATTACHMENT","attached")



        return view
    }





}
