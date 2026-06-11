package poo;
import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.ArrayList;

public class App implements DrawListener {


    private Draw draw;
    CartaGui seteO = new CartaGui(Naipe.OURO, Valor.SETE, 100, 100);
    DadoGui dado = new DadoGui(300, 100);

    ArrayList<Gui> elementos = new ArrayList<>();


    public App() {
        this.draw = new Draw();
        this.draw.setTitle("Jogo de cartas");
        this.draw.setCanvasSize(1200, 600);
        this.draw.setXscale(0, 1200);
        this.draw.setYscale(0, 600);
        this.draw.setDefaultCloseOperation(3);
        this.draw.enableDoubleBuffering();
        this.draw.addListener(this);

        elementos.add(seteO);
        elementos.add(dado);
        for(Gui g : elementos){
            g.desenhar(draw);

        }

    }

    @Override
    public void mouseClicked(double x, double y) {
        for(Gui g : elementos){
            if (g.clicouDentro(x, y)){
                g.desenhar(draw);
            }

        }
    }

    static void main (String[] args){
        App app = new App();







    }
}
