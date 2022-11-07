/**
 * Esta clase denominada CuentaCorriente modela una cuenta bancaria
 * que es una subclase de Cuenta. Tiene un nuevo atributo: sobregiro.
 */

public class CuentaCorriente extends Cuenta {
    /* Atributo que define un sobregiro de la cuenta que surge cuando el saldo de la cuenta es negativo */
    double sobregiro;

    /**
     * Constructor de la clase CuentaCorriente
     *
     * @param saldo Parámetro que define el saldo de la cuenta corriente
     * @param tasa  Parámetro que define la tasa anual de interés de la
     *              cuenta corriente
     */
    CuentaCorriente(double saldo, double tasa) {
        super(saldo, tasa);
        this.sobregiro = 0;
    }

    /**
     * Método que recibe una cantidad de dinero a retirar y actualiza el
     * saldo de la cuenta
     *
     * @param dinero Parámetro que define la cantidad de dinero a
     *               retirar de la cuenta corriente
     */
    @Override
    public void retirar(double dinero) {
        /* Si el valor a retirar supera el saldo de la cuenta, el valor excedente se convierte en sobregiro y el saldo es cero */
        double resultado = this.saldo - dinero;
        if (resultado < 0) {
            this.sobregiro -= resultado;
            this.saldo = 0;
        } else {
            /* Si no hay sobregiro, se realiza un retiro normal */
            super.retirar(dinero);
        }
    }


    /**
     * Método que recibe una cantidad de dinero a consignar y actualiza
     * el saldo de la cuenta
     *
     * @param dinero Parámetro que define la cantidad de dinero a
     *               consignar en la cuenta corriente
     */
    @Override
    public void consignar(double dinero) {
        double residuo = this.sobregiro - dinero;
        if (this.sobregiro > 0) {

            /* Si el residuo es mayor que cero, se libera el sobregiro */
            if (residuo > 0) {
                this.sobregiro = 0;
                this.saldo = residuo;
            } else {
                /* Si el residuo es menor que cero, el saldo es cero y surge un sobregiro */
                this.sobregiro = -residuo;
                this.saldo = 0;
            }

        } else {
            /* Si no hay sobregiro, se realiza una consignación normal */
            super.consignar(dinero);
        }
    }

    /**
     * Método que genera el extracto mensual de la cuenta
     */
    public void extractoMensual() {
        super.extractoMensual();
    }

    /**
     * Método que muestra en pantalla los datos de una cuenta corriente
     */
    @Override
    public void imprimir() {
        System.out.println("Saldo = $ " + this.saldo);
        System.out.println("Cargo mensual = $ " + this.comisionMensual);
        System.out.println("Número de transacciones = " + (this.numeroDeConsignaciones + this.numeroDeRetiros));
        System.out.println("Valor de sogregiro = $" + (this.numeroDeConsignaciones + this.numeroDeRetiros));
    }
}
    
