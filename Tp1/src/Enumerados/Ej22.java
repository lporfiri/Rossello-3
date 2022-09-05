package Enumerados;

import java.util.Scanner;

public class Ej22 {
    /*
    22. Crea un enum con los dias de la semana,
    pide un dia de la semana e indica si es laboral o no (en el main).
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana: ");
        String dia = in.next();
        DiasSemana d = DiasSemana.valueOf(dia.toUpperCase());

        switch (d) {
            case SABADO, DOMINGO -> System.out.println("Dia no laborable");
            case LUNES, MARTES, MIERCOLES, JUEVES, VIERNES -> System.out.println("Dia laborale");
        }
    }



}

