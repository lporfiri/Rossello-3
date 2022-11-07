/**
 * Realizar un programa para la gestión de notas que al iniciarse muestre el siguiente menú:
 *
 *  1.Agregar nota
 *  2.Ver nota media
 *  3.Ver aprobados
 *  4.Salir
 *
 * A elegir la opcíon 1, se solicitará la introducción de una notay se guardará, volviendo a mostrar de nuevo el menú
 * Con las opciones 2 y 3 se mostrará, respectvamente, la nota media registrada hasta el momento y el número de aprobados. A elegir 4 se abandonará el programa
 *
 */

package Presentacion;

import logica.GestionNotas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;
        double nota;
        Scanner entrada = new Scanner(System.in);
        GestionNotas gestionNotas = new GestionNotas();

        do{
            menu();
            System.out.print("Ingrese una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("------------");
                    System.out.println("Agregar nota");
                    nota = entrada.nextDouble();
                    //Double.parseDouble(entrada.nextLine();
                    gestionNotas.guardarNota(nota);

                    System.out.println("------------");
                    break;
                case 2:
                    System.out.println("-------------------");
                    System.out.println("Ver nota media");

                    System.out.println("-------------------");
                    break;
                case 3:
                    System.out.println("-------------------");
                    System.out.println("Ver lista de aprobados");

                    System.out.println("-------------------");
                    break;
                case 4:
                    System.out.println("-------------------");
                    System.out.println("Gracias por usar este programa");

                    System.out.println("-------------------");
                    break;
                default:
                    System.out.println("Eliga una opcion correcta");
                    break;
            }


        }while(opcion != 4);
    }
    public static void menu(){
        System.out.println("1. Agregar nota");
        System.out.println("2. Ver media");
        System.out.println("3. Ver aprobados");
        System.out.println("4. Salir");
    }
}
