package EstructurasDeControl;

/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *

*/

import java.util.Scanner;

class Ejercicio8_Practica {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Cuadrado de Asteriscos");
        System.out.println(" ---------- ");
        System.out.println("Ingrese un Nro :");
        int num = entrada.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if ((i == 1)|| (i ==num) || (j == 1) || (j == num))
                    System.out.print("*");
                
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    }
