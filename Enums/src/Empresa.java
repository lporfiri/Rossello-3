import java.util.ArrayList;

public class Empresa {
    //variable de instancia: lista de empleados (lsita de objectos de tipo Persona)
    ArrayList<Persona> empleados; // declaro la variable de tipo "lista de personas"
    Empresa(){
        // cuando se crea una empresa se inicializa la lista
        this.empleados = new ArrayList<>(); // instancio/inicializo/creo  la lista
    }
    public void agregarEmpleado(Persona empleado){
        // se ase uno del metodo ADD de la clase ArrayList
        this.empleados.add(empleado); // agrego un elemento a la lista
    }

    // mostrar empleados por tipo de estudio
    public  void mostrarPorEstudio(NivelEstudio estudio){
        for(Persona empleado: empleados){
           if(empleado.getEstudios() == estudio){
               System.out.println(empleado);
           }
        }
    }
    // mostrar toda la lista de empleados
    public  void mostrarEmpleados(){
        for(Persona empleado: empleados){
            System.out.println(empleado);
        }
    }
}
