/*

17. Dada una cadena, extraer la cuarta y quinta letra usando el metodo substring.
 */
package Basicos;

public class Ej17 {
    public static void main(String[] args) {
        String a = "Dada una cadena";
        int posIni = a.indexOf("a");
        int posSiguiente = a.indexOf("a",posIni+1);
        System.out.println(posIni);
        System.out.println(posSiguiente);



    }
}
