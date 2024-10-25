fun main(args: Array<String>) {
        println("Ingrese un numero: ")
        val num = readln().toInt()
        for (i in 1..10) {
            println(num * i)
        }
    }