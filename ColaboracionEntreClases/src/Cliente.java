public class Cliente {
    private String nombre;
    private double saldo;

    // Metodos

    // constructor
    public Cliente(String nom) {
        nombre = nom;
        saldo = 0;
    }
    // metodos para depositar
    public void depositar(double monto) {
        saldo = saldo + monto;
    }
    // metodos para extraer
    public void extraer(double monto) {
        if(saldo > monto){
            saldo = saldo - monto;
        }
    }
    // metodos para retorna el saldo
    public double retornarMonto() {
        return saldo;
    }

    public void imprimir() {
        System.out.println(nombre + " tiene depositado la suma de $" + saldo);
    }
}
