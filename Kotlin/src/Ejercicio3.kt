
    fun main(args: Array<String>) {
        val pi = Math.PI
        println("Introduce el radio del circulo")
        val radio = readln().toInt()
        val area = pi * radio * radio
        println("El area del circulo es: $area")
    }