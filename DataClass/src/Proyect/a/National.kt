package Proyect.a

open class National(override var city: String): Travel() {
    override var country = "México"

    protected val fees = mapOf(
        "Monterrey " to 480,
        "Guadalajara" to 350,
        "CDMX" to 360,
        "San Cristobal de las Casas" to 240,
        "San Miguel de Allende" to 320
    )

    override fun getPrice(numDays: Int): Float {
        val fee =  fees[city]
        return if (fee == null) 0.0f else fee*numDays *1f
    }

    override fun quotePrice():Float {
        val price = getPrice(numDays)
        if(price==0.0f){ //si no existe tarifa para esa ciudad, notificamos al usuario
            println("Lo sentimos, no hacemos viajes a esta ciudad")
        } else{
            println("Tu viaje a $city cuesta \$$price") //notificamos el precio al usuario
        }
        return price
    }

}