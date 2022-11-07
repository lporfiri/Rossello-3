public class Novela extends Libro{
    TipoNovela tipo;
    Novela(String titulo, String autor, TipoNovela tipo){
        super(titulo, autor);
        this.tipo = tipo;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Tipo:" + this.tipo);
    }

    public TipoNovela getTipo() {
        return tipo;
    }

    public void setTipo(TipoNovela tipo) {
        this.tipo = tipo;
    }
}
