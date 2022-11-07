/**
 * Esta clase denominada CuentaAhorros modela una cuenta de ahorros
 * que es una subclase de Cuenta. Tiene un nuevo atributo: activa.
 */

public class CuentaAhorro extends Cuenta {
    /* Atributo que identifica si una cuenta está activa; lo está si su saldo es superior a 10000 */
    private boolean cuentaActiva;

    /**
     * Constructor de la clase CuentaAhorros
     *
     * @param saldo Parámetro que define el saldo de la cuenta de ahorros
     * @param tasa  Parámetro que define la tasa anual de interés de la
     *              cuenta de ahorros
     */

    CuentaAhorro(double saldo, double tasa) {
        super(saldo, tasa);
        isCuentaActiva();
    }

    public boolean isCuentaActiva() {
        return !(this.saldo < 10000);
    }


    /**
     * Método que recibe una cantidad de dinero a consignar y actualiza
     * el saldo de la cuenta
     *
     * @param dinero Parámetro que define la cantidad a consignar en
     *               una cuenta de ahorros
     */
    public void consignar(double dinero) {
        if (this.cuentaActiva) {
            super.consignar(dinero);
        }
    }

    /**
     * Método que recibe una cantidad de dinero a retirar y actualiza el
     * saldo de la cuenta
     *
     * @param dinero Parámetro que define la cantidad a retirar de una
     *               cuenta de ahorros
     */
    public void retirar(double dinero) {
        if (this.cuentaActiva) {
            super.retirar(dinero);
        }
    }


    /**
     * Método que genera el extracto mensual de una cuenta de ahorros
     */
    @Override
    public void extractoMensual() {
        /* Si la cantidad de retiros es superior a cuatro, se genera una comisión mensual */
        if (this.numeroDeRetiros > 4) {
            this.comisionMensual += (this.numeroDeRetiros - 4) * 1000;
        }
        super.extractoMensual();
        isCuentaActiva();
    }

    /**
     * Método que muestra en pantalla los datos de una cuenta de ahorros
     */
    @Override
    public void imprimir() {
        System.out.println("Saldo: $" + this.saldo);
        System.out.println("Comision mensual: $" + this.comisionMensual);
        System.out.println("Nro de transacciones:" + (this.numeroDeConsignaciones + this.numeroDeRetiros));
    }

}
