class Person {
    class Persona(
        private var nombre: String = "",
        private var apellido: String = "",
        private var sexo: String = "",
        private var altura: Double
    ){
        class a constructor(nombre: String,apellido: String,sexo: String,altura: Double)
        init{
            this.nombre = nombre
            this.apellido = apellido
            this.sexo = sexo
            this.altura = altura
            println("-------------------------------------------------------------")
            println("Nombre: " +nombre)
            println("Apellido: " +apellido)
            println("Sexo: " +sexo)
            println("Altura: " +altura)
        }


}
    }