fun main(){
    println("Introduce un numero")
    val num = readln().toInt()
    if (num % 2 == 0){
        println("El numero introducido $num es par")
    }else println("El numero introducido $num es impar")
}