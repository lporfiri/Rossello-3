package Ej1;

public class Cuenta {
    // variables de instancia
    String titular;
    double cantidad;
    //Constructores:

    /**
     * Constructor que requiere un titular de forma obligatoria
     *
     * @param titular titular de la cuenta.
     */
    Cuenta(String titular) {
        titular = titular;
        cantidad = 0;
    }

    Cuenta(String titular, double monto) {
        titular = titular;
        cantidad = monto;
    }

    // metodos:
    void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad = this.cantidad + cantidad; // igual a this.cantidad += cantidad;
        }
    }

    void retirar(double cantidad) {
        this.cantidad = this.cantidad - cantidad;// igual a this.cantidad -= cantidad;
        if(this.cantidad < 0)
            this.cantidad = 0;
    }


    //METODOS GETTERS

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    // METODOS SETTES

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // METODO ToString

    @Override
    public String toString() {
        return "titular: " + titular + " - cantidad: " + cantidad;
    }
}
