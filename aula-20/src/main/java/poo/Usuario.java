package poo;

public class Usuario {
    //-nome: String
    //#emprestimos: int;

    private String nome;
    protected int emprestimos = 0;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getEmprestimos() {
        return emprestimos;
    }
}
