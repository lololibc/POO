package poo;

import edu.princeton.cs.algs4.Draw;

public class CartaGui extends Carta implements Gui{

    private double x;
    private double y;
    private boolean frente;

    public CartaGui(Naipe naipe, Valor valor, double x, double y) {
        super(naipe, valor);
        this.x = x;
        this.y = y;
    }

    public void clicar() {
        this.frente = !frente;
    }

    public boolean isFrente() {
        return frente;
    }

    public void desenhar(Draw draw){
        if (!frente){
            draw.picture(this.x, this.y, "cartas/"+this.valor.inicial+this.naipe.inicial+".png");
            draw.show();
        }else{
            draw.picture(this.x, this.y, "cartas/fundoa.png");
            draw.show();
        }
    }
    public boolean clicouDentro(double x, double y){
        if(x <= (this.x+36) && x>= (this.x-36) && y<=(this.y+48) && y >= (this.y-48) ){
            this.clicar();
            return true;
        }else{
            return false;
        }
    }
}
