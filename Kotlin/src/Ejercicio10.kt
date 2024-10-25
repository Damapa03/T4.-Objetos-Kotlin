fun main(){
    println("¿De que tipo es la temperatura? \n\t 1. Celsius \n\t 2. Fahrenheit")
    val seleccion = readln().toInt()
    println("Introduzca la temperatura")
    val temp = readln().toInt()

    if (seleccion == 1){
        print("${temp}º C en Fahrenheit es: ${temp*9/5+32}")
    }else {
        print("${temp}º F en Celsius es: ${(temp-32)*5/9}")
    }
}