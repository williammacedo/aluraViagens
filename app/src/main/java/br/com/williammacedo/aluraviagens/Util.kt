package br.com.williammacedo.aluraviagens

import java.math.BigDecimal
import java.text.NumberFormat
import java.util.*

object MoedaUtil {
    fun formatBrasilCurrency(value: BigDecimal): String {
        val f = NumberFormat.getCurrencyInstance(Locale("pt", "br"))
        return f.format(value)
    }
}