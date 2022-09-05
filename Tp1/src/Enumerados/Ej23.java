package Enumerados;

import java.util.Scanner;

public class Ej23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana: ");
        String dia = in.next();

        System.out.println(DiasSemana.valueOf(dia.toUpperCase()));
    }
}
