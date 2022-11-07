/**
 * Esta clase denominada Cuenta modela una cuenta bancaria con los
 * atributos saldo, número de consignaciones, número de retiros, tasa
 * anual de interés y comisión mensual.
 */
public class Cuenta {
    protected double saldo;
    protected int numeroDeConsignaciones;
    protected int numeroDeRetiros;
    protected double tasaAnual;
    protected double comisionMensual;

    /**
     * Constructor de la clase Cuenta
     * @param saldo Parámetro que define el saldo de la cuenta
     * @param tasa Parámetro que define la tasa anual de interés de
     * la cuenta
     */
    public Cuenta(double saldo, double tasa) {
        this.saldo = saldo;
        this.numeroDeConsignaciones = 0;
        this.numeroDeRetiros = 0;
        this.tasaAnual = tasa;
    }

    /**
     * Método que recibe una cantidad de dinero a consignar y actualiza
     * el saldo de la cuenta
     * @param dinero Parámetro que define la cantidad de dinero a
     * consignar en la cuenta
     */
    public void consignar(double dinero) {
        this.saldo += dinero;
        this.numeroDeConsignaciones = this.numeroDeConsignaciones + 1;
    }

    /**
     * Método que recibe una cantidad de dinero a retirar y actualiza el
     * saldo de la cuenta
     * @param monto Parámetro que define la cantidad de dinero a retirar
     * de la cuenta
     */
    public void retirar(double monto) {
        if (monto <= this.saldo) {
            this.saldo = this.saldo - monto;
            this.numeroDeRetiros = this.numeroDeRetiros + 1;
        } else {
            System.out.println("El monto a retirar excede el saldo actual.");
        }

    }

    public void calcularInteres() {
        double tasaMensual = this.tasaAnual / 12;
        double interesMensual = this.saldo * tasaMensual;
        this.saldo += interesMensual;
    }


    /**
     * Método que calcula interés mensual de la cuenta a partir de la tasa
     * anual aplicada
     */
    public void extractoMensual() {
        this.saldo = this.saldo - this.comisionMensual;
        calcularInteres();
    }

    /**
     * Método que genera un extracto aplicando al saldo actual una
     * comisión y calculando sus intereses
     */
    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Nro de consignaciones: " + numeroDeConsignaciones);
        System.out.println("Nro. de retiros" + numeroDeRetiros);
        System.out.println("Tasa Anual: " + tasaAnual);
        System.out.println("Comision Mensual: " + comisionMensual);
    }


}
