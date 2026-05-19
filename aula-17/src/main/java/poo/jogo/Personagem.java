package poo.jogo;

public abstract class Personagem {
//    class Personagem{
//        #vida: int
//        #ataque: int
//        #velocidade: int;
//        +Personagem(v: int, a: int, v: int)
//        +mover()String
//        +atacar()String
//    }

    protected int vida;
    protected int ataque;
    protected int velocidade;

    public Personagem(int vida, int ataque, int velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public String mover(){
        return "movendo ";
    }

}
