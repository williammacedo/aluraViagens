package br.com.williammacedo.aluraviagens.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.williammacedo.aluraviagens.dao.TripDAO
import br.com.williammacedo.aluraviagens.databinding.ActivityMainBinding
import br.com.williammacedo.aluraviagens.ui.adapters.ListTripsAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var listTripAdapter: ListTripsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configureListTrip()
    }

    private fun configureListTrip() {
        val listTrips = binding.listTrips
        listTripAdapter = ListTripsAdapter(this)
        listTrips.adapter = listTripAdapter
    }

    override fun onResume() {
        super.onResume()
        listTripAdapter.update(TripDAO().all())
    }
}