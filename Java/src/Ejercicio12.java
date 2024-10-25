import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        String n = sc.nextLine();

        for (int i = n.length()-1; i >= 0; i--) {
            System.out.print(n.charAt(i));
        }
    }
}