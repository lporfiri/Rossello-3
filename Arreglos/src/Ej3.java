import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        /*
        3. Crea un array de una longitud que determine el usuario y
        que le permita insertar numeros entre 0 y 10
         */

        Scanner in = new Scanner(System.in);
        int dimension = 0;
        System.out.print("Ingrese el tamaño del array: ");
        dimension = in.nextInt();
        int[] arreglo = new int[dimension];
        int i = 0;

        while (true) {
            byte numero = 0;
            System.out.printf("Ingrese un valor para arreglo[%d]= ", i);
            numero = in.nextByte();
            if (numero >= 0 && numero <= 10) {
                arreglo[i] = numero;
                i++;
            }
            if (i == arreglo.length) break;
        }

        // muestro como quedó el arreglo con un for each
        for (int num : arreglo) {
            System.out.printf("arreglo[%d]: %d \n",i++,num);
        }
    }
}
