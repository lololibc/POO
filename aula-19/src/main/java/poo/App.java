package poo;
import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.ToDoubleBiFunction;

public class App implements DrawListener {


    private Draw draw;
    private ArrayList<CartaGrafica> baralho = new ArrayList<>();


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

        //TODO ARRUMAR ESSE TROÇO
        int x =10;
        int y = 600;
        for (Naipe n : Naipe.values()){
            for (Valor v : Valor.values()){
                this.baralho.add(new CartaGrafica(n, v, x, y));
                x+= 100;
            }
            x = 10;
            y-=60;

        }

        for(CartaGrafica c: baralho){
            c.desenhar(this.draw);
        }

    }

    @Override
    public void mouseClicked(double x, double y) {

        for(CartaGrafica c: baralho){
            if (c.clicouDentro(x, y)){
                c.desenhar(this.draw);
            }

        }
    }

    static void main (String[] args){
        App app = new App();







    }
}
