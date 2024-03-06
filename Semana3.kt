import Person.*
import Vehiculo.*

fun main (){
    val carro = vehi(
        "Rojo",
        "Toyota",
        "Corolla",
        "ABC123"
    )

    carro.mostrar()
    println("El coche está encendido: ${carro.encendido}")
    carro.encender()
    println("El coche está apagado: ${carro.apagado()}")
    carro.apagado()
    println("La cantidad de gasolina es: ${carro.gasolina} litros")
    carro.recargar(10)
    println("Nivel de gasolina después de recargar: ${carro.gasolina} litros")



    val personaa= Persona("Yareli", "Herrera", "Fem", 1.50)



}

