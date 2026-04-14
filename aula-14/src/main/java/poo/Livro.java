package poo;

import java.util.ArrayList;

public class Livro {

    private String titulo;
    private Pessoa autor;
    private ArrayList<Capitulo> capitulos;

    public Livro(String titulo, Pessoa autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.capitulos = new ArrayList<>();
    }

    public void adicionaCapitulo(String t){
        capitulos.add(new Capitulo(t));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        this.capitulos.forEach(sb::append);

        return String.format("""
                Livro: %s
                Autor: %n%s
                Capítulos: %n%s                
                """, titulo, autor, sb.toString());
    }
}
