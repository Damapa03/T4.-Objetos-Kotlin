import java.util.Scanner;

public class Ejercicio8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int e = 0;
        int i =0;
        int o = 0;
        int u = 0;

        System.out.println("Introduce una palabra");
        String palabra = sc.nextLine();
        for (int j = 0; j < palabra.length(); j++){
            switch (palabra.charAt(j)){
                case 'a': a++; break;
                case 'e': e++; break;
                case 'i': i++; break;
                case 'o': o++; break;
                case 'u': u++; break;
                default: break;
            }
        }

        System.out.println("El numero de cada vocal de la palabra es: \n\ta: "+a+"\n\te: "+e+"\n\ti: "+i+"\n\to: "+o+"\n\tu: "+u);
        sc.close();
    }
}