package poo;

import java.util.ArrayList;

public class App {

    private ArrayList<Conta> contas;

    public App(){
        this.contas = new ArrayList<>();
    }

    void menu(int opcao){
        switch (opcao){
            case 1 -> {cadastrar();}
            case 2 -> {listar();}
            case 3 -> {depositar();}
            case 4 -> {sacar();}
            case 5 -> {}
            default -> IO.println("Opção inválida");
        }

    }
    void cadastrar(){
        int num = Integer.parseInt(IO.readln("Entre com um número para a conta: "));
        String nome = IO.readln("Entre com o nome: ");
        int saldo = Integer.parseInt(IO.readln("Entre com o saldo inicial: "));
        contas.add(new Conta(num, nome, saldo));
    }
    void listar(){
        contas.forEach(IO::println);
    }
    void depositar(){
        int num = Integer.parseInt(IO.readln("Entre com o número da conta: "));
        for (Conta e : contas){
            if(e.getNum()==num){
                int valor = Integer.parseInt(IO.readln("Entre com o valor para depositar: "));
                e.depositar(valor);
                return;
            }
        }
        IO.println("Número de conta não encontrado;");
    }
    void sacar(){
        int num = Integer.parseInt(IO.readln("Entre com o número da conta: "));
        for (Conta e : contas){
            if(e.getNum()==num){
                int valor = Integer.parseInt(IO.readln("Entre com o valor para sacar: "));
                if(e.sacar(valor)){
                    IO.println("Saldo atual: "+ e.getSaldo());
                }else{
                    IO.println("O saldo atual é menor que o valor que você quer sacar\nSaldo atual: "+ e.getSaldo());
                }
            }
            return;
        }
        IO.println("Número de conta não encontrado;");
    }



    static void main(String[] args) {

        App app = new App();
        int opcao;
        do {
            IO.println("Opções:\n1-> Cadastro \n2-> Listar Contas\n3-> Depositar\n4-> Sacar\n5-> Sair");
            opcao = Integer.parseInt(IO.readln("Opção escolhida: "));
             app.menu(opcao);
        }while(opcao != 5);

        //menu
        //1 cadastro
        //2 listar contas
        //3 depositar
        //4 sacar
        //5 sair


    }
}
