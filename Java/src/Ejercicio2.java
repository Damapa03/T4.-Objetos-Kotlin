import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("El numero introducido "+n+" es par");
        } else System.out.println("El numero introducido "+n+" es impar");
        sc.close();
    }
}