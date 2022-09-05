package Basicos;

import java.util.Scanner;

public class Ej10 {
    /*
    10. Crear una aplicacion que nos permite insertar numeros hasta que insertemos un -1.
    Calcular el numero de numeros introducidos.
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int contador = 0;
        int numero;
        System.out.println("Ingrese \"-1\" para terminal el programa.");
        do {
            System.out.print("Ingrese un numero: ");
            numero = in.nextInt();
            contador++;
        }while(numero != -1);

        System.out.println("Total de numeros ingresados: " + contador);
    }
}
