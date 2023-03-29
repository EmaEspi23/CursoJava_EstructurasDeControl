package EstructurasDeControl;

/*
Escriba un programa que valide si una nota está entre 0 y 10, sino
está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
import java.util.Scanner;

public class Ejercicio8_Teoria {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una nota entre 0 y 10");
        int nota = entrada.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("La nota " + nota + " no es valida, ingrese otra nota:");
            nota = entrada.nextInt();
        }
        System.out.println("La nota " + nota + " es valida");
    }
}
