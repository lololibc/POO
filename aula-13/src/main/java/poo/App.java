package poo;

import java.util.ArrayList;
import java.util.HashMap;

public class App {

    HashMap<String, Livro> livros = new HashMap<>();

    public App(){
        this.livros = new HashMap<>();
    }


    void menu(int opcao){
        switch (opcao){
            case 1 -> {cadastrar();}
            case 2 -> {listarlivros();}
            case 3 -> {livrosAno();}
            case 4 -> {alterarDados();}
            case 5 -> {}
            default -> IO.println("Opção inválida");
        }

    }

    void cadastrar(){
        var isbn = IO.readln("Entre com o número ISBN: ");
        var titulo = IO.readln("Entre com o título: ");
        var autor = IO.readln("Entre com o autor: ");
        int ano = Integer.parseInt(IO.readln("Entre com o ano de lançamento: "));
        livros.put(isbn, new Livro(isbn, titulo, autor, ano));
    }

    void listarlivros(){
        livros.forEach((isbn, livro) -> {
            System.out.println("isbn: " + isbn);
            System.out.println("titulo: " + livro.getTitulo());
            System.out.println("autor: " + livro.getAutor());
            System.out.println("ano: " + livro.getAno());
        });
    }

    void livrosAno(){
        int ano = Integer.parseInt(IO.readln("Entre com um ano de lançamento: "));
        System.out.println("Livros do ano "+ ano +":");
        livros.forEach((isbn, livro) -> {
            if (livro.getAno() == ano) {
                IO.println(livro.getTitulo());
                return;
            }
            System.out.println("Não há livros desse ano.");
        });
    }

    //TODO
    void alterarDados(){

    }




    static void main() {

        App app = new App();

        int opcao;
        do {
            IO.println("Opções:\n1-> Cadastrar livro \n2-> Listar Livros\n3-> Livros publicados em ano específico\n4-> Alterar dados de livro\n5-> Sair");
            opcao = Integer.parseInt(IO.readln("Opção escolhida: "));
            app.menu(opcao);
        }while(opcao != 5);


    }
}
