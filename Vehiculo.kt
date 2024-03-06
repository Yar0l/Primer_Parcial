class Vehiculo {
    class vehi(
        var color: String,
        var marca: String,
        var modelo: String,
        var placas: String,
        var encendido: Boolean = false,
        var gasolina: Int = 0
    ){

        fun mostrar(){
        println("El color es: " +color)
        println("La marca es: " +marca)
        println("El modelo: " +modelo)
        println("Con placas: " +placas)

        }

    fun encender() {
        encendido = true
    }

    fun apagado() {
        encendido = false
    }

    fun recargar(Litros: Int = 0): Int {
        if (gasolina >= 100)
            println("Tanque lleno")
        else
            this.gasolina += Litros
        return gasolina
    }
}
}


