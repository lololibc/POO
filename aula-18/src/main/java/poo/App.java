package poo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class App {
    static void main() {

        Caixa<String> c = new Caixa<>("fala bbs");
        Caixa<Pessoa> d = new Caixa<>(new Pessoa("lou"));

        String s = c.getConteudo();

        String errado = d.getConteudo();

        ArrayList<String> teste = new ArrayList<>();

        HashMap<String, String> mapa = new HashMap();



    }
}
