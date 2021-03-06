package br.com.williammacedo.aluraviagens.domain

import java.math.BigDecimal

data class Trip(val city: String, val image: String, val days: Int, val price: BigDecimal)
