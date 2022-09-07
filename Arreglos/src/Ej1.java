public class Ej1 {
    /*
    1. Crea un array que contenga los numeros del 1 al 100. Muestralos por pantalla.
     */
    public static void main(String[] args) {
        int [] enteros = new int[100];
        int i = 0;
        // cargar array
        for(i = 0; i< 100; i++) {
            enteros[i] = i+1;
        }
        // mostrar array
        for(i = 0;i < enteros.length;i++){
            System.out.println(enteros[i]);
        }
    }
}
