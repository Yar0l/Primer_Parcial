package Proyect.a

import `interface`.Bajas
import `interface`.IPromotion

class NationalLowSeason(city: String): National(city), IPromotion, Bajas {

    override val discount : Float = 10.0f
    override val typeDiscount = 0

    override fun getPrice(numDays: Int): Float {
        val amount = super.getPrice(numDays)
        return if (amount == 0.0f) 0.0f else getDiscountPrice(amount)
    }

    override fun BajaViajes() {
        if (this.city != null) {
            println("Desea dar de baja el viaje? 1=Si 2=No")
            val respuesta = readln().toInt()
            if (respuesta == 1) {
                println("Se dio de baja el viaje ${this.country} a ${this.city}")
                this.country = ""
                this.city = ""
            } else {
                println("No se dio de baja el viaje")
            }
        }
    }
}