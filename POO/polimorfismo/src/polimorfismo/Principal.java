package polimorfismo;

public class Principal {
    public static void main(String[] args) {
//       Vehiculo v1 = new Vehiculo();
        test(new Vehiculo());
        System.out.println("---------");
        test(new Avion());
        System.out.println("---------");
        test(new BicicletaElectrica());
        System.out.println("---------");

    }
    public static void test(Vehiculo v){
        System.out.println(v);
        v.encender();
    }
}
