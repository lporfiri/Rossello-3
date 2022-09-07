package Basicos;

import java.util.Scanner;

public class Ej25 {
    /*
    25. Pedir numeros al usuario y cuando el usuario meta un -1 se terminará el programa.
Al terminar, mostrará lo siguiente:
  - mayor numero introducido
  - menor numero introducido
  - suma de todos los numeros
  - suma de los numeros positivos
  - suma de los numeros negativos
  - media de la suma (la primera que pido)

El número -1 no contara como número
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        int contador = 0;
        double media =  0;
        int mayor = 0, menor = 0,suma = 0, sumPositivos = 0, sumNegativos = 0;

        while (true) {
            System.out.print("ingrese un numero: ");
            numero = in.nextInt();
            if (numero == -1) break;
            if (contador == 0)
                mayor = menor = numero;

            if (numero > mayor) mayor = numero;
            if (numero < menor) menor = numero;
            if (numero > 0) sumPositivos += numero;
            if (numero < 0) sumNegativos += numero;
            suma += numero;
            contador++;
            media = suma / contador;
        }

        System.out.println(" - mayor numero introducido:"+mayor+"\n" +
                "  - menor numero introducido: "+menor+"\n" +
                "  - suma de todos los numeros: "+suma+"\n" +
                "  - suma de los numeros positivos: "+sumPositivos+"\n" +
                "  - suma de los numeros negativos: "+sumNegativos+"\n" +
                "  - media de la suma (la primera que pido): " + media);

    }

}
