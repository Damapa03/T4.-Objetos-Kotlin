fun main(){
    println("Introduce un número")
    val num = readln().toInt()
    var aux = 0
    if (num % 2 != 0){
        for (i in 1..num){
            if (num % i == 0){
                aux++
            }
        }
        if (aux >= 3){
            println("El numero no es primo")
        }else println("El numero es primo")
    }else println("El numero no es primo")
}