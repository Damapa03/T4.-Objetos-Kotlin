import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tipo de temperatura:\n\t 1. Celsius\n\t 2. Fahrenheit ");
        int tipo = sc.nextInt();
        System.out.println("Introduce la temperatura");
        int temperatura = sc.nextInt();

        if (tipo == 1) {
            System.out.println(temperatura+"º C en Fahrenheit es: " + temperatura*9/5+32);
        }else System.out.println(temperatura+"º F en Celsius es: "+ (temperatura-32)*5/9);
    }
}