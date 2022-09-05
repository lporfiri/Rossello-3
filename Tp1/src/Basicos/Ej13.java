package Basicos;

import java.util.Objects;
import java.util.Scanner;

public class Ej13 {
/*
13. Pedir al usuario que nos escriba frases de forma infinita hasta que insertemos una cadena vacia.
Mostrar la cadena resultante
 */
    public static void main(String[] args) {
        String frase = "";
        String texto ="";
        Scanner in = new Scanner(System.in);

        do{
            System.out.print("Ingrese una oracion: ");
            frase = in.nextLine();
            texto = texto.concat("\n").concat(frase);
        }while(!frase.equals(""));

        System.out.println(texto);
    }
}
