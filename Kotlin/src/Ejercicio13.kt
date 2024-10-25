fun main(args: Array<String>) {

        val anime = Anime()
        println("Crea tu propio anime \n Introduce el nombre:")
        anime.nombre = readln()
        println("Introduce el genero")
        anime.genero = readln()
        println("Introduce el numero de episodios")
        anime.episodios = readln().toInt()
        println(anime.toString())
    }

    class Anime {
        var nombre: String? = null
        var genero: String? = null
        var episodios: Int = 0

        constructor()
        constructor(nombre: String?, genero: String?, episodios: Int) {
            this.nombre = nombre
            this.genero = genero
            this.episodios = episodios
        }

        override fun toString(): String {
            return "Anime{" +
                    "nombre='" + nombre + '\'' +
                    ", genero='" + genero + '\'' +
                    ", episodios=" + episodios +
                    '}'
        }
    }