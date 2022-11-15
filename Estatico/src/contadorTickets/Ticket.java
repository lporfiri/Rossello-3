package contadorTickets;

public class Ticket {
    private static int contador; // variable de clase
    private int numero;
    private String fechaCompra;
    private  String DNI;

    public Ticket(String fechaCompra, String DNI){
        contador++; // contador =  contador + 1;
        this.numero = contador;
        this.fechaCompra = fechaCompra;
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "numero=" + numero +
                ", fechaCompra='" + fechaCompra + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
