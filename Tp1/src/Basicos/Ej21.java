package Basicos;

import java.util.Scanner;

public class Ej21 {
    public static void main(String[] args) {
        /*
        21. Crea un menu con distintas opciones en Java.
        Que controle si una opcion no esta dentro del rango.
         */
        Scanner in = new Scanner(System.in);
        int op = 0;

        while (op != 5) {
            System.out.println("Elegir una opcion: ");
            System.out.println("1) Suma");
            System.out.println("2) Resta");
            System.out.println("3) Multiplicacion");
            System.out.println("4) Division");
            System.out.println("5) salir");

            op = in.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Suma");
                    break;
                case 2:
                    System.out.println("Resta");
                    break;
                case 3:
                    System.out.println("Multiplicacion");
                    break;
                case 4:
                    System.out.println("Division");
                    break;
                case 5:
                    System.out.println("bye!");
                    break;
                default:
                    System.out.println("Ops! Opcion no valida!");
            }
        }

    }
}
