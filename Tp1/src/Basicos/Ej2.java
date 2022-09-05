package Basicos;

import java.util.Scanner;

/*
* 2. Realizar la suma, resta, multiplicacion, division y resto de dos numeros.
* */
public class Ej2 {
    // Funcion/Metodo principal
    public static void main(String[] args) {
        int num1, num2;
//        num1 = 3;
//        num2 = 56;
        int resultado = 0;
        Scanner input = new Scanner(System.in); //instancia de un ob de tipo Scanner


        System.out.print("Ingrese valor 1: ");
        num1 = input.nextInt();
        System.out.print("Ingrese valor 2: ");
        num2 = input.nextInt();

        //suma,
        resultado = suma(num1, num2);
        System.out.println(resultado);
        // resta,
        resultado = resta(num1, num2);
        System.out.println(resultado);
        // multiplicacion
        resultado = multiplicacion(num1, num2);
        System.out.println(resultado);
        // division y
        resultado = num1 / num2;
        System.out.println(resultado);
        // resto
        resultado = num1 % num2;
        System.out.println(resultado);
    }

    // Funciones nuestras propias
    public static  int suma(int a, int b){
        return a + b;
    }

    public static  int resta(int a, int b){
        return a - b;
    }
    public  static  int multiplicacion(int a, int b){
        return a * b;

    }
}
