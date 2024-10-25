import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
           System.out.println(fib(i));
        }
    }
    public static int fib(int i) {
        if(i < 2){
            return i;
        }else return fib(i-1)+fib(i-2);
    }
}
