package polimorfismo;

public class Avion extends Vehiculo {
    @Override
    public void encender() {
        calefaccionarCarburador();
        regularMezclaDeCombustible();
        inyectarCombustible();
        masPasos();
    }

    public void calefaccionarCarburador() {
        System.out.println("carburador listo");
    }

    public void regularMezclaDeCombustible() {
        System.out.println("mezcla regulada");
    }

    public void inyectarCombustible() {
        System.out.println("combustible inyectado");
    }

    public void masPasos() {
        System.out.println("muchos pasos mas...");
    }
}
