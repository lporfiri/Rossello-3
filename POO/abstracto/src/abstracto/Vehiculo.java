package abstracto;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String patente;

    public Vehiculo(String marca, String modelo, String patente){
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }

    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void frenar() {
        System.out.println("Frenando...");
    }

    public void encender() {
        System.out.println("Encendiendo..");
    }

    public String getMarca() {
        return this.marca;
    }

    private void chequearMotor() {
        System.out.println("Chequeando motor...");
    }
}
