package Herencia;

public class Alumno extends Persona {
    private double promedio;
    private String institucion;

    Alumno(){}
    Alumno(String nombre, String apellido, double promedio){
        super(nombre, apellido);
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
}
