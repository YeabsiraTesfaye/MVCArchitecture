package com.example.midexam.Controller


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.midexam.Model.Route
import com.example.midexam.R
import kotlinx.android.synthetic.main.route_card_view_item.view.*

class RouteListAdapter(context: Context): RecyclerView.Adapter<RouteViewHolder>() {
    private val inflater = LayoutInflater.from(context)
    var routes = emptyList<Route>()

    fun  getRoutes(){
        //get route from database here

        routes = listOf(
            Route("Arat Kilo",10.11,33.2, 3.50),
            Route("Sidist Kilo",1.11,33.2, 3.50),
            Route("Piyasa",3.11,33.2,1.50),
            Route("Megenagna",10.01,33.2,3.00),
            Route("Stadium",30.4,33.2,1.50),
            Route("Bole",10.11,33.2,3.00),
            Route("CMC",10.11,33.2,3.00),
            Route("Hayat",10.11,33.2,3.00)

        )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RouteViewHolder {
        val recyclerViewItem = inflater.inflate(R.layout.route_card_view_item, parent, false)

        return RouteViewHolder(recyclerViewItem)
    }

    override fun getItemCount() = routes.size

    override fun onBindViewHolder(holder: RouteViewHolder, position: Int) {
        val route = routes[position]
        holder.routeTitle.text = route.title
        holder.routeGeo.text = route.lat.toString() +" "+route.lon
        holder.price.text = route.price.toString()


        //viewModel = ViewModelProviders.of(AlternativeRoutingFragment()).get(routeViewModel::class.java)
    }
}

class RouteViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
    val routeTitle = itemView.location_title
    val routeGeo = itemView.location_geo
    val price = itemView.location_price



}
