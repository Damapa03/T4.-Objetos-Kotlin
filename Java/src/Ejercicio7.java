import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine();
        String reversed = "";

        for(int i = frase.length()-1; i >= 0; i--){
            reversed += frase.charAt(i);
        }
        System.out.println(reversed);
    }
}