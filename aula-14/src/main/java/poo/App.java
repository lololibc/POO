package poo;

import java.util.ArrayList;

public class App {
    static void main() {


        //Agraregação
        Motor simples = new Motor();

        Carro fusca = new Carro("VW", simples);

        fusca = null;


        //Compisição

        Livro livro = new Livro("louiselinda", new Pessoa("louise") );

        livro.adicionaCapitulo("introdução");





    }
}
