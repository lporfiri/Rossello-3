public class Persona {
    /**
     * variables de instancia de la clase Persona
     * nombre, apellido (Strings) y estudios (Enums)
     */
    private String nombre;
    private String apellido;
    private NivelEstudio estudios;

    /**
     * Método constructor de la clase Persona
     *
     * @param n nombre de la persona
     * @param a apellido de la persona
     * @param e nivel de estudio de la persona
     */
    Persona(String n, String a, NivelEstudio e) {
        nombre = n;
        apellido = a;
        estudios = e;
    }

    /**
     * Método para obtener el nivel de estudio de la persona
     *
     * @return retorna un nivel de estudio (un enum)
     */
    public NivelEstudio getEstudios() {
        return estudios;
    }

    //Método toString()


    @Override
    public String toString() {
        return "Persona{ " +
                "nombre:'" + nombre + " " + apellido  +
                "', estudios:" + estudios +
                " }";
    }
}
