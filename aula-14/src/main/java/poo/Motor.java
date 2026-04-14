package poo;

public class Motor {

//    class Motor{
//        - int hp
//        - int giroAtual
//        - int cilindros
//        + Motor()
//        +acelerar(v; int)void
//    }

    private int hp;
    private int giroAtual;
    private int cilindros;

    public Motor() {
    }

    public void acelerar(int v){
        this.giroAtual += v;
    }


}
