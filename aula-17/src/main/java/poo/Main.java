package poo;

import poo.jogo.*;
import poo.produtos.Dimensao;
import poo.produtos.SemFio;
import poo.produtos.Telefone;

public class Main {
    static void main() {


//        Telefone t = new Telefone(1, "serie","modelo", 2, new Dimensao(3, 3,3) );
//        IO.println(t.toString());
//
//        SemFio sf = new SemFio(1, "serie", "modelo", 2, new Dimensao(3, 3, 3), 20, 2, 2 );
//        IO.println(sf.toString());
//        Telefone a = new SemFio(1, "serie", "modelo", 2, new Dimensao(3, 3, 3), 20, 2, 2 );
//        sf.getFrequencia();
//        ((SemFio)t).getFrequencia();
//
//        Telefone[] vetor = new Telefone[3];
//
//        vetor[0] = t;
//        vetor[1] = sf;
//        vetor[2] = a;
//
//
//        for (Telefone aux : vetor) {
//            if (aux instanceof SemFio novo){
//                IO.println(novo.getFrequencia());
//            }
//
//        }

        Aldeao a = new Aldeao();

        Cavaleiro c = new Cavaleiro();

        Arqueiro arq = new Arqueiro();

        Personagem[] vetor = new Personagem[3];
        vetor[0] = a;
        vetor[1] = c;
        vetor[2] = arq;

        for(Personagem p : vetor){
            IO.println(p.mover());
            if (p instanceof Guerreiro g){
                IO.println(g.atacar());
            }
        }



    }
}
