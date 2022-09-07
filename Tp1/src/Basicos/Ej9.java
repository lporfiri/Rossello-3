package Basicos;

import java.util.Scanner;

public class Ej9 {
    /*
      9. Realizar la suma del 1 al numero que indiquemos, este debe ser mayor que 1.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = 0;

        do {
            System.out.print("Ingresa un numero mayor que 1: ");
            numero = in.nextInt();
        } while (numero < 1);

        for (int i = 1; i <= numero; i++) {
            System.out.println("la suma entre " + i + " y " + numero + " es " + (i + numero));
            //System.out.println(i + i);
        }
    }

}
