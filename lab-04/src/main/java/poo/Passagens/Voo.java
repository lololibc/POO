package poo.Passagens;

import java.time.LocalDate;
import java.util.HashMap;

public class Voo {

    private int numero;
    private String destino;
    private LocalDate data;
    private HashMap<String, Passagem> assentos = new HashMap<>();

    public Passagem reservarPassagem(String assento, Passageiro passageiro) {
        if (assentos.containsKey(assento)) {
            return null; // assento já ocupado
        }

        Passagem passagem = new Passagem(this, passageiro, assento);
        assentos.put(assento, passagem);
        return passagem;
    }
}
