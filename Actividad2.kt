import kotlin.math.sign

 fun arearec(base:Float=3.50F, alt:Float=12.35F):Float{
 return base*alt
 }

 fun volPris(h:Float= 9.10F ):Float{
 return arearec()*h
 }

 fun promedio(primera:Float= 8F ,segunda:Float= 8F, tercera:Float):Float{
 return (primera+segunda+tercera)/3
 }

 fun triangulo ():Unit{
 print("Ingrese el primer lado del triangulo: ")
 val l1= readLine()?.toDouble()
 print("Ingrese el siguiente lado: ")
 val l2= readLine()?.toDouble()
 print("Ingrese el ultimo lado: ")
 val l3= readLine()?.toDouble()

 if(l1 == l2 && l2==l3){ //Lados iguales
 println("Es un triangulo equilatero")
 }
 else  if ((l1 != l2 && l1 != l3) && l2 != l3  ){ //Lados diferentes
 println("Es un triangulo escaleno")
 }
 else  if ((l1 == l2 || l1 == l3) || (l2 == l3)){ //2 lados iguales
 println("Es un triangulo isoceles")
 }
 else{
 println("No es ninguno de estos triangulos ")
 }
 }

 fun identificarTipoDato(valor: Any): String {

    return when (valor) {
        is String -> "String"
        is Int -> "Int"
        is Double -> "Double"
        else -> "Otro"
    }
}

fun main (){

  /*1*/ println("La area del rectángulo es: "+arearec())

  /*2*/ println("El volumen del prisma rectangular es: ${volPris()}")

  /*3*/ println("El promedio con valores por defecto: ${promedio(tercera = 10F)}")

  /*5*/ triangulo()

  /*6*/  val dato = "Empanadas de camaron"
    println("El tipo de dato es un: ${identificarTipoDato(dato)}")








}
