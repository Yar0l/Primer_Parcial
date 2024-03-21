package Proyect.a

abstract class Travel {
    protected open var country: String = ""
        get() {
            return field
        }
        set(valor:String){
            field = valor
        }
    protected open var city: String = ""
        get() {
            return field
        }
        set(valor: String){
            field = valor
        }
    protected val serviceType = "Viaje"
    protected var reserved = false
    protected var paidAmount = 0
    protected var numDays = 0
        get() {
            return field
        }
        set(value) {
            field = value
        }

    fun reserve(numDays: Int){
        if(reserved){
            println("""¡Ya reservaste tu viaje! 
                       País: $country
                       Ciudad: $city
                       Precio: $paidAmount""".trimMargin())
            return
        }
        val amount = getPrice(numDays)
        if(amount== 0.toFloat()){
            return
        }
        reserved = true
        paidAmount = amount.toInt()
        println("""¡Viaje reservado exitosamente! 
                       País: $country
                       Ciudad: $city
                       Precio: $paidAmount""".trimMargin())
    }
    protected abstract fun getPrice(numDays: Int): Float

    abstract fun quotePrice(): Float
}
