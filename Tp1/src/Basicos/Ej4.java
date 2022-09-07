package Basicos;


import java.util.Scanner;

public class Ej4 {
    /*4. Indicar si un numero pasado por consola es par o no.*/
    public static void main(String[] args) {
        int numero = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        numero = input.nextInt();

        if (numero % 2 == 0){
            System.out.println("el numero ingresado es par");
        }else{
            System.out.println("El numero ingresado no es par");
        }

    }
}
