import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nuemero");
        int n = sc.nextInt();
        int aux = 0;
        if(n%2!=0){
            for (int i = 1; i <= n; i++){
                if (n%i==0){
                    aux++;
                }
            }
            if (aux >= 3){
                System.out.println("El numero no es primo");
            }else System.out.println("El numero es primo");
        }else System.out.println("El numero no es primo");
    }
}