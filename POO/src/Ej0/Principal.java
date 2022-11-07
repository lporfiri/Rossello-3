package Ej0;
// testeamos nuestra clase CuentaBancaria
public class Principal {
    public static void main(String[] args) {
        //Intanciamos / Creamos un Objecto de tipo "CuentaBancaria" con la palabra reservada new
        CuentaBancaria cb = new CuentaBancaria();

        cb.mostrarDatos();
        cb.CBU = "22345678900987654321";
        cb.alias = "Faro.Rojo.Crudo";
        cb.mostrarDatos();



        System.out.println(cb.obtenerSaldo());
        cb.depositar(500);
        System.out.println(cb.obtenerSaldo());
        cb.depositar(-40);
        System.out.println(cb.obtenerSaldo());
        cb.extraer(180);
        System.out.println(cb.obtenerSaldo());
        cb.extraer(100);
        System.out.println(cb.obtenerSaldo());
        cb.extraer(500);
        System.out.println(cb.obtenerSaldo());





    }

}
