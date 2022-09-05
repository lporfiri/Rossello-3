package Basicos;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ej5 {

    /*5. Pedir 2 numeros por teclado e indicar si uno es mayor que el otro o si son iguales.*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;

        System.out.print("Ingrese un numero: ");
        num1 = in.nextInt();
        System.out.print("Ingrese otro numero: ");
        num2 = in.nextInt();

        if (num1 == num2){
            System.out.println(num1 + " es igual a " +  num2);
        } else if (num1 > num2) {
            System.out.println(num1 + " es mayor a " +  num2);
        }else{
            System.out.println(num1 + " es menor a " +  num2);
        }

    }
}
