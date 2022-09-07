public class Ej2 {
    /*
    2. Con el array creado anteriormente, calcula la suma y la media de todos sus valores.
     */
    public static void main(String[] args) {
        int[] enteros = new int[100];
        int i = 0;
        double media = 0;
        int suma = 0;

        // cargar array
        for (i = 0; i < 100; i++) {
            enteros[i] = i + 1;
        }
        // mostrar array
        for (i = 0; i < enteros.length; i++) {
            System.out.println(enteros[i]);
            suma += enteros[i];
            media = suma / (i + 1);
        }

        System.out.println("Calcula la suma: "+suma+" y la media: "+media+" de todos sus valores");
    }
}
