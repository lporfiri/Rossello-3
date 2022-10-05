package NumerosAleatoreos;

import java.util.Random;

public class Clase2 {
    public static void main(String[] args) {

        int aleatorio = 0;
        Random r = new Random();
        aleatorio = 4 + r.nextInt(5);
        System.out.println(aleatorio);

    }
}
