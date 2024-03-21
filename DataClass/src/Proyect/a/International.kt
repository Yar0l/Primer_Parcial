package Proyect.a


class International(): Travel(){
    constructor(country: String, city : String, numDays: Int) : this() {
        this.country = country
        this.city = city
        this.numDays = numDays
    }

    protected val Alemania = mapOf(
    "Munich" to 980.0f,
    "Berlín" to 820.0f,
    "Francfort" to 850.0f
    )
    protected val Chile = mapOf(
        "Santiago" to 643.0f,
        "Valparaíso" to 721.0f
    )
    protected val Canada = mapOf(
    "Vancouver" to 620.0f,
    "Ottawa" to 680.0f,
    "Montreal" to 600.0f
    )
    protected val Impuestos = mapOf(
        "Alemania" to .16f,
        "Chile" to .05f,
        "Canada" to .10f
    )

    override fun getPrice(numDays: Int) : Float{
        val impuesto = Impuestos[country]
        val dia: Float?
        var precio = 0.0f
        if (impuesto == null){
            return 0.0f
        }else when(country) {
            "Alemania" -> {
                dia = Alemania[city]
                precio = validarPrecio(dia, impuesto)
            }
            "Chile" -> {
                dia = Chile[city]
                precio = validarPrecio(dia, impuesto)
            }
            "Canada" -> {
                dia = Canada[city]
                precio = validarPrecio(dia, impuesto)
            }
        }
        return precio
    }

    override fun quotePrice() : Float {
        val price = getPrice(numDays)
        if (price==0.0f){
            println("Lo sentimos, no hacemos viajes a esta ciudad")
        } else{
            println("Tu viaje a $city cuesta \$$price")
        }
        return price
    }

    fun validarPrecio(dia : Float?, impuesto : Float) : Float{
        if (dia == null) {
            return 0.0f
        } else {
            return ((dia * impuesto * numDays) + (numDays * dia))
        }
    }
}
