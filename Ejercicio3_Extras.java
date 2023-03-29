package EstructurasDeControl;

import java.util.Scanner;

/**
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
 * trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la
 * función equals() de la clase String.
 */
public class Ejercicio3_Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una letra: ");
        char primerLetra = leer.next().charAt(0);

        String letra = String.valueOf(primerLetra);
        boolean vocal = "a".equals(letra) || "e".equals(letra )
                || "i".equals(letra) || "o".equals(letra) || "u".equals(letra);

        if (vocal) {
            System.out.println("La letra es una vocal");
        } else {
            System.out.println("La letra NO es vocal");
        }
    }
}
