package poo.Passagens;

import java.util.HashMap;

public class Passagem {
    private Voo voo;
    private Passageiro passageiro;
    private String assento;


    public Passagem(Voo voo, Passageiro passageiro, String assento) {
        this.voo = voo;
        this.passageiro = passageiro;
        this.assento = assento;
    }
}
