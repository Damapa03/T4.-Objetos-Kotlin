import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anime anime = new Anime();
        System.out.println("Crea tu propio anime \n Introduce el nombre:");
        anime.setNombre(sc.nextLine());
        System.out.println("Introduce el genero");
        anime.setGenero(sc.nextLine());
        System.out.println("Introduce el numero de episodios");
        anime.setEpisodios(sc.nextInt());
        System.out.println(anime.toString());

    }
    public static class Anime{
        private String nombre;
        private String genero;
        private int episodios;

        public Anime() {
        }
        public Anime(String nombre, String genero, int episodios) {
            this.nombre = nombre;
            this.genero = genero;
            this.episodios = episodios;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public int getEpisodios() {
            return episodios;
        }

        public void setEpisodios(int episodios) {
            this.episodios = episodios;
        }

        @Override
        public String toString() {
            return "Anime{" +
                    "nombre='" + nombre + '\'' +
                    ", genero='" + genero + '\'' +
                    ", episodios=" + episodios +
                    '}';
        }
    }
}

