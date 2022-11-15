package abstracto;

public class Principal {
    public static void main(String[] args) {
        Concesionaria c = new Concesionaria();
        Auto a = new Auto(true, "MarcaFalsa", "XYZ", "ABC123");
//        Vehiculo v = new Vehiculo("Ford", "1998", "GOL023");
        Moto m = new Moto(30, "suzuki", "150","abd234");
        c.agregarVehiculo(a);
        c.agregarVehiculo(m);





    }
}
