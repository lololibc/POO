package poo.jogo;

public class Cavaleiro extends Personagem implements Guerreiro{
    public Cavaleiro(){
        super(50, 3, 2);
    }

    @Override
    public String atacar() {
        return "Cavaleiro atacando";
    }

    @Override
    public String mover() {
        return super.mover() + "Cavaleiro ";
    }
}
