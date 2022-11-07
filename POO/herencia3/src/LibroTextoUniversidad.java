public class LibroTextoUniversidad  extends  LibroTexto{
    String facultad;
    LibroTextoUniversidad(String titulo, String autor, String curso, String facultad){
        super(titulo, autor, curso);
        this.facultad = facultad;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Facultad: "+ this.facultad);
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
}
