package Basicos;

import java.util.Scanner;

public class Ej12 {
    /*
    12. Eliminar los espacios de una frase pasada por consola por el usuario.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase = null;

        frase = "estos es una oracion";

        frase = frase.replace(" ","");
        System.out.println(frase);

    }
}
