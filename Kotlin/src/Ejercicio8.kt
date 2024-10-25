fun main() {
        var a = 0
        var e = 0
        var i = 0
        var o = 0
        var u = 0

        println("Introduce una palabra")
        val palabra = readln()
        for (j in 0 until palabra.length) {
            when (palabra[j]) {
                'a' -> a++
                'e' -> e++
                'i' -> i++
                'o' -> o++
                'u' -> u++
                else -> {}
            }
        }

        println("El numero de cada vocal de la palabra es: \n\ta: $a\n\te: $e\n\ti: $i\n\to: $o\n\tu: $u")
}