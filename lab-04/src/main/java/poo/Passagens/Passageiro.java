package poo.Passagens;

import java.util.ArrayList;
import java.util.HashMap;

public class Passageiro {

    private String nome;
    private String email;
    private String tel;
    private ArrayList<Passagem> passagens = new ArrayList<>();


    public boolean reservarPassagem(Voo voo, String assento){
        Passagem passagem = voo.reservarPassagem(assento, this);

        if (passagem == null){
            return false;
        }
        passagens.add(passagem);
        return true;
    }


}
