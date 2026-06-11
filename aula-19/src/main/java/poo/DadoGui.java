package poo;

import edu.princeton.cs.algs4.Draw;

public class DadoGui extends Dado implements Gui{
    protected double x;
    protected double y;

    public DadoGui(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    public boolean clicouDentro(double x, double y){
        return x <= (this.x + 25) && x >= (this.x - 25) && y <= (this.y + 25) && y >= (this.y - 25);
    }

    public void desenhar(Draw draw){
        draw.picture(this.x, this.y, "dados/"+this.jogar()+".png");
        draw.show();
    }
}
