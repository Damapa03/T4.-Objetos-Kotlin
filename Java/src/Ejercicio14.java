import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Videojuego juego = new Videojuego();
        Scanner sc = new Scanner(System.in);
        ArrayList<Videojuego> lista = new ArrayList<>();
        int seleccion = 0;
        while(seleccion != 4){
        System.out.println("¿Qué desea hacer? \n\t 1. Añadir videojuego \n\t 2. Eliminar videojuego \n\t 3. Mostar la lista de juegos  \n\t 4. Salir del programa");
            seleccion = sc.nextInt();
            switch (seleccion){
                case 1:
                    juego = new Videojuego();
                    System.out.println("Introduzca el nombre del videojuego");
                    sc.nextLine();
                    juego.setTitulo(sc.nextLine());
                    System.out.println("Introduzca la plataforma del videojuego");
                    juego.setPlataforma(sc.nextLine());
                    System.out.println("Introduzca las horas jugadas");
                    juego.setHorasJugadas(sc.nextInt());
                    lista.add(juego);
                    break;
                case 2:
                    System.out.println("¿Que juego desea eliminar?");
                    lista.remove(sc.nextInt()-1);
                    break;
                case 3:
                    System.out.println("Lista de juegos:");
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(i+1+". "+lista.get(i).toString());
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
    public static class Videojuego{
        String titulo;
        String plataforma;
        int horasJugadas;

        public Videojuego(String titulo, String plataforma, int horasJugadas) {
            this.titulo = titulo;
            this.plataforma = plataforma;
            this.horasJugadas = horasJugadas;
        }

        public Videojuego() {
        }

        public String getTitulo() {
            return titulo;
        }

        @Override
        public String toString() {
            return "Videojuego{" +
                    "titulo='" + titulo + '\'' +
                    ", plataforma='" + plataforma + '\'' +
                    ", horasJugadas=" + horasJugadas +
                    '}';
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getPlataforma() {
            return plataforma;
        }

        public void setPlataforma(String plataforma) {
            this.plataforma = plataforma;
        }

        public int getHorasJugadas() {
            return horasJugadas;
        }

        public void setHorasJugadas(int horasJugadas) {
            this.horasJugadas = horasJugadas;
        }
    }
}

