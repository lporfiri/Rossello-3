package Enumerados;

public enum Continente {
    AFRICA(1406728760,30370000),
    AMERICA(1037112744,43316000),
    ANTARTIDA(4490,13720000),
   ASIA(471715564,44010000),
    EUROPA(747543827,10180000),
    OCEANIA(43755195,9008500);



    private long poblacion;
    private  double  superfice;

    private Continente(long poblacion, double superfice) {
        this.poblacion = poblacion;
        this.superfice = superfice;
    }

    @Override
    public String toString() {
        return "Continente{" +
                "poblacion =" + poblacion +
                ", superfice =" + superfice +
                '}';
    }
}
