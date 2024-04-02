package ejerciciovideojuegos;

import java.util.ArrayList;
import java.util.List;

public class EjercicioVideojuegos {

    public static void main(String[] args) {
        List<VideoJuego> lista = new ArrayList<VideoJuego>();

        VideoJuego juego1 = new VideoJuego(1, "Sonic", "Sega", 1, "Aventura");
        VideoJuego juego2 = new VideoJuego(2, "Mario Bros", "Nintendo", 2, "Aventura");
        VideoJuego juego3 = new VideoJuego(3, "Crash Bandicoot", "Playstation 1", 1, "Aventura");
        VideoJuego juego4 = new VideoJuego(4, "MarioKart 64", "Nintendo 64", 4, "Carreras");
        VideoJuego juego5 = new VideoJuego(5, "Pokemon Stadium", "Nintendo 64", 1, "Lucha");
        lista.add(juego1);
        lista.add(juego2);
        lista.add(juego3);
        lista.add(juego4);
        lista.add(juego5);

        System.out.println("Lista de juegos sin cambios");
        System.out.println("=========================================");
        for (VideoJuego juego : lista) {
            System.out.println("\n Nombre: " + juego.getTitulo() + "\n Consola: "
                    + juego.getConsola() + "\n Cantidad de jugadores: " + juego.getCantidadJugadores());
        }
        System.out.println("=========================================");
        System.out.println("Lista de juegos despues de unos cambios");
        System.out.println("=========================================");
        juego5.setTitulo("Donkey Kong 64");
        juego5.setCantidadJugadores(2);
        juego1.setTitulo("Altered Beast");
        juego1.setCantidadJugadores(2);

        for (VideoJuego juego : lista) {
            System.out.println("\n Nombre: " + juego.getTitulo() + "\n Consola: "
                    + juego.getConsola() + "\n Cantidad de jugadores: " + juego.getCantidadJugadores());
        }
        System.out.println("=========================================");
        System.out.println("Lista de juegos de Nintendo 64");
        for (VideoJuego juego : lista) {
            if (juego.getConsola().equalsIgnoreCase("Nintendo 64")) {
                System.out.println("\n Nombre: " + juego.getTitulo() + "\n Consola: "
                        + juego.getConsola() + "\n Cantidad de jugadores: " + juego.getCantidadJugadores());
            }
        }

    }

}
