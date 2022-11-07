package logica;

import java.util.ArrayList;

public class GestionNotas {
    ArrayList<Double> listaNotas;

    public GestionNotas(){
        listaNotas = new ArrayList<>();
    }
    public void guardarNota(Double n){
        listaNotas.add(n);
    }

    public double media(){
        double media = 0;
        for(double nota : listaNotas){
            media = media + nota; //que es lo mismo q media += nota;
        }
        return  media/listaNotas.size();
    }

    public int aprobados(){
        int cantAprobados = 0;
        for( double nota: listaNotas){
            if(nota > 5){
                cantAprobados++;
            }
        }
        return  cantAprobados;
    }


}
