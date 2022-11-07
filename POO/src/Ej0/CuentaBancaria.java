package Ej0;

public class CuentaBancaria {
    // variables de instancia (atributos de la clase):
    String CBU;
    String alias;
    double saldo;

    // Metodos (Comportammiento o acciónes de la clase):

    void mostrarDatos(){

        System.out.println(CBU + " " + alias + " " + saldo);
    }

    double obtenerSaldo(){
        return saldo;
    }

    void depositar(double monto){
        if(monto > 0){
            saldo = saldo + monto;
        }
    }
    boolean saldoDisponible(double monto){

        return saldo >= monto;
    }
    void extraer(double monto){
        if(saldoDisponible(monto)) {
            saldo = saldo - monto;
        }

    }
}
