import Dataclss.Movie
import Proyect.a.International
import Proyect.a.National
import Proyect.a.NationalLowSeason

fun main(){
    /*val national = National ("Monterrey")
     national.quotePrice(2)
     national.reserve(4)*/
    val Chile = International("Chile","Santiago",2)
        Chile.reserve(4)

    val Canada = International("Canada","Otawa",8)
    Canada.reserve(3)

    /*val scaryMovie = Movie("Scary Movie", "Comedia", 82.30)
     scaryMovie.createAt= "2000"
     println(scaryMovie)*/
    /*println(scaryMovie.createAt)
    println(scaryMovie.component2())
    val scaryMovie2 = scaryMovie.copy(name = "Scary Movie 2", duration = 80.1)
    println("""
        scary movie :  $scaryMovie
        scary movie 2: $scaryMovie2 """.trimIndent())*/

}
