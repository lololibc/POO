package poo;

import edu.princeton.cs.algs4.Draw;

public interface Gui {
    //+ desenhar (Draw d) : void
    //+ clicouDentro(x : int, y: int) boolean

    public default void desenhar(Draw draw){

    }

    public default boolean clicouDentro(double x, double y){
        return true;
    }
}
