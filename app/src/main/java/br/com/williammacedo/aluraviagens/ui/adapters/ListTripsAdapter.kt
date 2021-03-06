package br.com.williammacedo.aluraviagens.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import br.com.williammacedo.aluraviagens.MoedaUtil
import br.com.williammacedo.aluraviagens.R
import br.com.williammacedo.aluraviagens.domain.Trip
import java.text.NumberFormat
import java.util.*
import kotlin.collections.ArrayList

class ListTripsAdapter(val context: Context) : BaseAdapter() {

    val dataset = ArrayList<Trip>()

    override fun getCount(): Int {
        return dataset.size
    }

    override fun getItem(position: Int): Trip {
        return dataset[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val item = getItem(position)
        val view: View
        val holder: TripViewHolder

        if(convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_trip, parent, false)
            holder = TripViewHolder(view)
            view.tag = holder
        } else {
            view = convertView
            holder = view.tag as TripViewHolder
        }

        configureCard(holder, item)

        return view
    }

    private fun configureCard(holder: TripViewHolder, item: Trip) {
        holder.city.text = item.city
        holder.days.text = formatDays(item)
        holder.price.text = MoedaUtil.formatBrasilCurrency(item?.price)
        holder.image.setImageResource(getImageResource(item))
    }

    private fun formatDays(item: Trip) =
            if (item.days > 1) {
                "${item.days} dias"
            } else {
                "${item.days} dia"
            }

    private fun getImageResource(item: Trip): Int {
        val resources = context.getResources()
        val idDoDrawable = resources.getIdentifier(item.image, "drawable", context.getPackageName());
        return idDoDrawable
    }

    fun remove(trip: Trip) {
        dataset.remove(trip)
        notifyDataSetChanged()
    }

    fun update(trips: List<Trip>) {
        dataset.clear()
        dataset.addAll(trips)
        notifyDataSetChanged()
    }

}
