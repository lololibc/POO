package poo.jogo;

public class Arqueiro extends Personagem implements Guerreiro{

    public Arqueiro() {
        super(35, 2, 1);
    }

    @Override
    public String mover() {
        return super.mover() + "Arquerio ";
    }

    @Override
    public String atacar() {
        return "Arqueiro atacando";
    }
}
