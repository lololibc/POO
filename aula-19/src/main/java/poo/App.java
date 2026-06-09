package poo;
import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.lang.reflect.Array;

public class App implements DrawListener {


    private Draw draw;
    CartaGrafica asO = new CartaGrafica(Naipe.OURO, Valor.AS, 100, 100);


    public App() {
        this.draw = new Draw();
        this.draw.setTitle("Jogo de cartas");
        this.draw.setCanvasSize(1200, 600);
        this.draw.setXscale(0, 1200);
        this.draw.setYscale(0, 600);
        this.draw.setDefaultCloseOperation(3);
        this.draw.enableDoubleBuffering();
        this.draw.addListener(this);


        asO.desenhar(draw);
    }

    @Override
    public void mouseClicked(double x, double y) {
        if(asO.clicouDentro(x, y)){
            asO.desenhar(draw);
        }


    }

    static void main (String[] args){
        App app = new App();







    }
}
