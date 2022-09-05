package Basicos;

import java.util.Scanner;

public class Ej11 {
    /*
    11. Contar cuantas vocales tiene una frase pasada por consola por el usuario.
     */
    public static void main(String[] args) {
        int cuentaVocales = 0;
        char[] vocales = {'a','e','i','o','u'};
        String frase;
        Scanner in = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        frase = in.nextLine();

        for (int l = 0; l < frase.length(); l++){
            for (char vocale : vocales) {
                if (frase.toLowerCase().charAt(l) == vocale)
                    cuentaVocales++;
            }
        }

        System.out.println("total de vocales: " + cuentaVocales);

    }
}
