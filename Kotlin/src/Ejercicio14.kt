import java.util.*

object Ejercicio14 {
    @JvmStatic
    fun main(args: Array<String>) {

        val lista: MutableList<Videojuego> = mutableListOf()
        var seleccion = 0
        while (seleccion != 4) {
            val juego: Videojuego = Videojuego(null, null,null)
            println("¿Qué desea hacer? \n\t 1. Añadir videojuego \n\t 2. Eliminar videojuego \n\t 3. Mostar la lista de juegos  \n\t 4. Salir del programa")
            seleccion = readln().toInt()
            when (seleccion) {
                1 -> {
                    println("Introduzca el nombre del videojuego")
                    juego.titulo = readln()
                    println("Introduzca la plataforma del videojuego")
                    juego.plataforma = readln()
                    println("Introduzca las horas jugadas")
                    juego.horasJugadas = readln().toInt()
                    lista.add(juego)
                }
                2 -> {
                    println("¿Que juego desea eliminar?")
                    lista.removeAt(readln().toInt() - 1)
                }
                3 -> {
                    println("Lista de juegos:")
                    for (i in 0..<lista.size) {
                        println("${i+1}. ${lista[i]}")
                    }
                }
                4 -> println("Saliendo del programa")
                else -> println("Opcion no valida")
            }
        }
    }

    class Videojuego(var titulo: String?, var plataforma: String?, var horasJugadas: Int?) {

        override fun toString(): String {
            return "Videojuego{" +
                    "titulo='" + titulo + '\'' +
                    ", plataforma='" + plataforma + '\'' +
                    ", horasJugadas=" + horasJugadas +
                    '}'
        }
    }
}