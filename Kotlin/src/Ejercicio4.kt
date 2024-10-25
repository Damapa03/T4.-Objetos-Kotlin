    fun main(args: Array<String>) {
        val random = (Math.random() * 100 + 1).toInt()
        var intento = 0
        while (intento != random) {
            println("Intenta adivinar el numero del 1 al 100")
            intento = readln().toInt()
            if (intento > random) {
                println("El numero introducido es mayor")
            } else println("El numero introducido es menor")
        }
    }