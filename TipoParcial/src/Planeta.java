public class Planeta {
    // var instancia
    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciaSol;
    private boolean esObservable;
    private TipoPlaneta tipoPlaneta;

    // constructor
//    public Planeta(){}
    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaSol, boolean esObservable, TipoPlaneta tipoPlaneta) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.esObservable = esObservable;
        this.tipoPlaneta = tipoPlaneta;
    }

    // otros metodos:
    public void imprimir() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("cantidadSatelites: " + this.cantidadSatelites);
        System.out.println("masa: " + this.masa);
        System.out.println("volumen: " + this.volumen);
        System.out.println("diametro: " + this.diametro);
        System.out.println("distanciaSol: " + this.distanciaSol);
        System.out.println("esObservable: " + this.esObservable);
        System.out.println("tipoPlaneta: " + this.tipoPlaneta);
    }

    public double calcularDensidad() {
        return this.masa / this.volumen;
    }

    public boolean esPlanetaExterior() {
        double limite = 149597870 * 3.4;
        // boolean esExterior = false;
        if(this.distanciaSol > limite) {
            //esExterior = true;
            return true;
        } else {
            return false;
        }

        //return esExterior;
    }


}
