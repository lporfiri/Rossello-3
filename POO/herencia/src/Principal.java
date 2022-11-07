import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Cuenta de ahorro");
        System.out.print("Ingrese saldo inicial: $");
        double saldoInicial = in.nextDouble();

        System.out.print("Ingrese tasa de interes: ");
        double tasaAhorro = in.nextDouble();

        CuentaAhorro ca1 = new CuentaAhorro(saldoInicial, tasaAhorro);

        System.out.print("Ingresar cantidad a consignar: $");
        double consignar = in.nextDouble();
        ca1.consignar(consignar);

        System.out.print("Ingrese cantidad a retirar: ");
        double retirar = in.nextDouble();
        ca1.retirar(retirar);

        ca1.extractoMensual();
        ca1.imprimir();


    }
}
