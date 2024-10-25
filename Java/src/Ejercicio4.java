import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100+1);
        int intento = 0;
        Scanner sc = new Scanner(System.in);
        while(intento != random){
            System.out.println("Intenta adivinar el numero del 1 al 100");
            intento = sc.nextInt();
            if (intento > random){
                System.out.println("El numero introducido es mayor");
            }else System.out.println("El numero introducido es menor");
        }

    }
}