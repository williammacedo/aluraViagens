package br.com.williammacedo.aluraviagens.dao

import br.com.williammacedo.aluraviagens.domain.Trip
import java.math.BigDecimal
import java.util.*
import kotlin.collections.ArrayList

class TripDAO {
    fun all(): List<Trip> {
        return ArrayList(Arrays.asList(
                Trip("São Paulo", "sao_paulo_sp", 2, BigDecimal(243.99)),
                Trip("Belo Horizonte", "belo_horizonte_mg", 3, BigDecimal(421.50)),
                Trip("Recife", "recife_pe", 4, BigDecimal(754.20)),
                Trip("Rio de Janeiro", "rio_de_janeiro_rj", 6, BigDecimal(532.55)),
                Trip("Salvador", "salvador_ba", 5, BigDecimal(899.99)),
                Trip("Foz do Iguaçu", "foz_do_iguacu_pr", 1, BigDecimal(289.90))))
    }
}