import java.util.Arrays;

public class Banco {
    //private Cliente cliente1, cliente2, cliente3;
    private Cliente clientes[] = new Cliente[3];

    public Banco() {
        clientes[0] = new Cliente("Juan");
        clientes[1] = new Cliente("Ana");
        clientes[2] = new Cliente("Pedro");
    }
    public void operar() {
        clientes[0].depositar(100);
        clientes[1].depositar(150);
        clientes[1].depositar(59);
        clientes[2].depositar(200);
        clientes[2].extraer(150);
    }
    public void depositosTotales() {
        //cliente1.retornarMonto() + cliente2.retornarMonto() + cliente3.retornarMonto();
        double totales = 0;
        int tam = clientes.length;
        for(int i = 0; i < tam; i++){
            totales = clientes[i].retornarMonto() + totales;
           // totales = totales + clientes[i].retornarMonto();
            // totales += clientes[i].retornarMonto();
        }

        System.out.println("El total de dinero en el banco es: $" + totales);
        int i = 0;
        // recorro el array con while
        while(i < tam) {
            clientes[i].imprimir();
            i++; // i = i + 1;
        }
        // recorro el array con un for
//        for (i = 0; i < tam;i++){
//            clientes[i].imprimir();
//        }
        //cliente2.imprimir();
        //cliente3.imprimir();
    }

}
