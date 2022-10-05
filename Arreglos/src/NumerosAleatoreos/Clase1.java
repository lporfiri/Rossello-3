package NumerosAleatoreos;

public class Clase1 {
    public static void main(String[] args) {
        int aleatorio = 0;

        // random del 0 al 100
        aleatorio = (int) (Math.random() * 100); //Casting de double a int
        System.out.println(aleatorio);
    }
}
