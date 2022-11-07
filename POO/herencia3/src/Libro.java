public class Libro {
    String titulo;
    String autor;
    double precio;

    Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    void imprimir(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: "+ this.autor);
        System.out.println("Precio: $" + this.precio);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
