import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = Math.PI;
        System.out.println("Introduce el radio del circulo");
        int radio = sc.nextInt();
        double area = pi*radio*radio;
        System.out.println("El area del circulo es: " + area);
    }
}