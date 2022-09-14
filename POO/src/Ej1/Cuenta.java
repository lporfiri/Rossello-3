package Ej1;

public class Cuenta {

    String titular;
    double cantidad;

    Cuenta(String titular){
        titular = titular;
        cantidad = 0;
    }
    Cuenta(String titular, double cant){
        titular = titular;
        cantidad = cant;
    }


}
