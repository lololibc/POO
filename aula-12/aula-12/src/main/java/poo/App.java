package poo;

import java.util.ArrayList;

public class App {

    private ArrayList<Conta> contas;

    public App(){
        this.contas = new ArrayList<>();
    }

    void menu(String opcao){
        switch (opcao){
            case "1" -> {
                String num = IO.readln("Entre com o numero: ");
                String nome = IO.readln("Entre com o nome: ");
                int saldo = Integer.valueOf(IO.readln("Entre com o saldo inicial: "));
                contas.add(new Conta(num, nome, saldo));
            }
            case "2" -> {
            }
            case "3" -> {
            }
            case "4" -> {
            }
            case "5" -> {

            }
        }

    }


    static void main(String[] args) {

        App app = new App();

        do {
            var opcao = IO.readln("Entre com uma opção: ");
            app.menu(opcao);
        }while(true);

        //menu
        //1 cadastro
        //2 listar contas
        //3 depositar
        //4 sacar
        //5 sair


    }
}
