package poo;

import java.util.ArrayList;

public class Biblioteca {
    protected ArrayList<Livro> livros = new ArrayList<>();
    protected ArrayList<Usuario> usuarios = new ArrayList<>();

    public void emprestar(String t, Usuario u) throws BibliotecaException{
        for (Livro livro : livros){
            if (livro.getTitulo().equals(t)){
                if(livro.isDisponivel()){
                    if(u.emprestimos < 3 ){
                        livro.disponivel =  false;
                        u.emprestimos+= 1;
                        break;
                    }else{
                        throw new MaximoEmprestimosException("Máximo de emprestimos atingido");
                    }
                }else{
                    throw new EmprestimoInvalidoException("Esse livro não está disponível");
                }
            }
        }
        throw new LivroInvalidoException("Livro não encontrado");
    }


    public void devolver(String t, Usuario u) throws BibliotecaException{
        for (Livro livro : livros){
            if (livro.getTitulo().equals(t)){
                if(!livro.isDisponivel()){
                    livro.disponivel =  true;
                    u.emprestimos-= 1;
                    break;
                }else{
                    throw new DevolucaoInvalidaException("Esse livro não foi emprestado");
                }
            }
        }
        throw new LivroInvalidoException("Livro não encontrado");
    }
}
