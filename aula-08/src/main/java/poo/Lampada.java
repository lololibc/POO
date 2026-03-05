package poo;

public class Lampada {

    // Atributos
    private boolean ligada;

    // Métodos
    boolean isLigada(){
        return ligada;
    }

    boolean apertarInterruptor(){
        ligada = !ligada;
        return ligada;
    }
}
