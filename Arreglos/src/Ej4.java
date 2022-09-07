public class Ej4 {
    public static void main(String[] args) {
        /*
        4. Crea un array insertando numeros aleatorios entre 0 y 10. Muestralos por pantalla.
         */

        int[] arreglo = new int[100];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 10);
        }

        // mostrar arreglo:
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("%d\t",arreglo[i]);
            if(i%2 == 0) System.out.println();
        }


    }
}
