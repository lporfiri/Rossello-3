package polimorfismo;

public class BicicletaElectrica extends Vehiculo {
    @Override
    public void encender(){
        prenderPantalla();
        energizarMotor();
    }

    public void prenderPantalla(){
        System.out.println("Pantalla encendida");
    }

    public void energizarMotor(){
        System.out.println("motor listo");
    }

}
