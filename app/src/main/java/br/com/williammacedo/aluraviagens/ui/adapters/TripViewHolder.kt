package br.com.williammacedo.aluraviagens.ui.adapters

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import br.com.williammacedo.aluraviagens.R

class TripViewHolder(val view: View) {

    val city: TextView = view.findViewById(R.id.item_trip_city)
    val image: ImageView = view.findViewById(R.id.item_trip_imageview)
    val days: TextView = view.findViewById(R.id.item_trip_days)
    val price: TextView = view.findViewById(R.id.item_trip_price)

}