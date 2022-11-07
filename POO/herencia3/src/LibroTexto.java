public class LibroTexto extends Libro{
    String curso;

    LibroTexto(String titulo, String autor,String curso){
        super(titulo, autor);
        this.curso = curso;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Curso: "+ this.curso);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
