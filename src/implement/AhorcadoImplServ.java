package implement;

import entity.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoImplServ {

    public void menu() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar palabra:");
        String palabra = leer.next();
        System.out.println("Ingresar vidas:");
        Integer jugadasMax = leer.nextInt();
        Ahorcado juego = crearJuego(palabra, jugadasMax);
        iniciarJuego(juego);
    }

    public void iniciarJuego(Ahorcado juego) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String[] palabraBuscada = crearPalabraBuscada(juego.getPalabra().length);
        do {
            Integer auxLetrasEncontradas = juego.getLetrasEncontradas();
            System.out.println("Letra a buscar");
            String letra = leer.next();
            for (int i = 0; i < palabraBuscada.length; i++) {
                if (juego.getPalabra()[i].equalsIgnoreCase(String.valueOf(letra.charAt(0)))) {
                    palabraBuscada[i] = juego.getPalabra()[i];
                    juego.setLetrasEncontradas(juego.getLetrasEncontradas() + 1);
                }
            }
            //Podría ser una función con mensajes genéricos
            if (auxLetrasEncontradas.equals(juego.getLetrasEncontradas())) {
                System.out.println("La letra no se encuentra en la palabra");
                juego.setJugadasMax(juego.getJugadasMax() - 1);
            }
            System.out.println("Vidas: " + juego.getJugadasMax());
            System.out.print(mostrarPalBuscada(palabraBuscada));
            System.out.println("Letras encontradas: " + juego.getLetrasEncontradas());
            System.out.println("-----------------------");
        } while (!Arrays.equals(palabraBuscada, juego.getPalabra()) && !juego.getJugadasMax().equals(0));
        if (Arrays.equals(palabraBuscada, juego.getPalabra())) {
            System.out.println("Felicitaciones, salvaste al pibe");
        } else {
            System.out.println("Felicitaciones, ascendiste a buscado por la ley");
        }
    }

    public String mostrarPalBuscada(String[] palabraBuscada) {
        String mensaje = "";
        for (int i = 0; i < palabraBuscada.length; i++) {
            mensaje += "[" + palabraBuscada[i] + "]";
        }
        return mensaje += "\n";
    }

    public String[] crearPalabraBuscada(Integer longitud) {
        String[] palabraBuscada = new String[longitud];
        for (int i = 0; i < longitud; i++) {
            palabraBuscada[i] = " ";
        }
        return palabraBuscada;
    }

    public String[] ingresarPalabra(String palabra) {
        return palabra.split("");
    }

    public Ahorcado crearJuego(String palabra, Integer jugadasMax) {
        return new Ahorcado(ingresarPalabra(palabra), 0, jugadasMax);
    }
}
