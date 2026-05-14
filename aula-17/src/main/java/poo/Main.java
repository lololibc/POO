package poo;

import poo.produtos.Dimensao;
import poo.produtos.SemFio;
import poo.produtos.Telefone;

public class Main {
    static void main() {


        Telefone telefone = new Telefone(1, "serie","modelo", 2, new Dimensao(3, 3,3) );
        IO.println(telefone.toString());





        SemFio telefonesemfio = new SemFio(1, "serie", "modelo", 2, new Dimensao(3, 3, 3), 20, 2, 2 );

        IO.println(telefonesemfio.toString());
    }
}
