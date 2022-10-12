import java.util.Scanner;

public class TestEnums1 {

    public static void main(String[] args) {
        // metodo ordinal() de la clase enums
        System.out.println("Usando el metodo ordinal() para NivelEstudio.POSGRADO.ordinal() -> " + NivelEstudio.POSGRADO.ordinal());

        // metodo toString() o name()
        System.out.println("Usando el metodo toString() para  NivelEstudio.TERCIARIO.toString() -> " + NivelEstudio.TERCIARIO.toString());
        System.out.println("Usando el metodo name() para NivelEstudio.TERCIARIO.name() -> " + NivelEstudio.TERCIARIO.name());

        // metodo values() -> un array con todos elementos
        NivelEstudio[] niveles = NivelEstudio.values();
        System.out.println("\nUsando el metodo values() que retorna un array con los elementos del enums\n");
        for (int i = 0; i < niveles.length; i++) {
            System.out.println(i + 1 + ") " + niveles[i]);
        }

        // pidiendo una opción con teclado
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese una opcion: ");
        int opcion = in.nextInt(); // con nextInt() espero leer un entero por teclado
        System.out.println("Opcion seleccionada " + niveles[opcion-1]); //  - 1 porque los elementos arrancan de 0 y lo moestamos desde 1
    }
}
