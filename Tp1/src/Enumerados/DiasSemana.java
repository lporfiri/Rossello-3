package Enumerados;

public enum DiasSemana {
    LUNES(true),
    MARTES(true),
    MIERCOLES(true),
    JUEVES(true),
    VIERNES(true),
    SABADO(false),
    DOMINGO(false);

    private boolean laborable;

    private DiasSemana (boolean laborable){
        this.laborable = laborable;
    }

    @Override
    public String toString() {
        if(laborable){
            return "Dia laborable";
        }
        return  "Dia no laborable";
    }
}
