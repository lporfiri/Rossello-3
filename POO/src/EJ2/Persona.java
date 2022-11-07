package EJ2;

import java.util.Random;

public class Persona {
    //nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura
    private final int PESO_IDEAL = -1;
    private final int INFRAPESO = 0;
    private final int SOBREPESO = 1;
    private final char SEXO_PRED = 'H';
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    // Constructor por defecto
    Persona(){
        this("",0,"",'H',0,0);
    }

    /**
     * Constructor con 3 parametros:
     * @param nombre
     * @param edad
     * @param sexo
     */
    Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    /**
     * Constructor con todos los parametros:
     * @param nombre
     * @param edad
     * @param DNI
     * @param sexo
     * @param peso
     * @param altura
     */
    Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    private String generarDNI(){
        int min =  1000000;
        int max = 99999999;
        int DNI;
        Random r = new Random();
        DNI = r.nextInt(max + min) + min;
        return Integer.toString(DNI);
    }


    /**
     * Metodo que calcula el IMC, el mismo retorna un entero y tiene
     * 2 parametros:
     * @param peso peso
     * @param altura altura
     * @return ICM con codigo numerico: -1 Peso ideal, 0 Infrepeso, 1 sobre peso
     */
    int CalculaIMC(double peso,double altura){
        double ICM =  peso/altura*altura;

        if(ICM >= 20 && ICM <= 25) return INFRAPESO;
        if(ICM > 25) return SOBREPESO;

        return PESO_IDEAL;
    }

    boolean esMayorDeEdad(){
        return this.edad > 18;
    }

    void comprobarSexo(char sexo){
        if(sexo != 'H' && sexo != 'M')
            this.sexo = SEXO_PRED;
    }
}
