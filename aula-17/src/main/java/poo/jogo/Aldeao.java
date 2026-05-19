package poo.jogo;

public class Aldeao extends Personagem implements Guerreiro{

    public Aldeao(){
        super(25, 1, 1);
    }

    @Override
    public String mover() {
        return super.mover() + "Aldeao ";
    }

    @Override
    public String atacar() {
        return "Aldeao atacando";
    }
}
