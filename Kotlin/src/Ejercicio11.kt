fun main(){
    println("introduce un numero")
    val num = readln().toInt()
    for (i in 0..<num){
        println(fib(i))
    }
}

fun fib(num : Int) : Int{
    if (num <2){
        return num
    }else return fib(num-1) + fib(num-2)
}