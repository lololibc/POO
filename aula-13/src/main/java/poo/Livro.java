package poo;

public class Livro {

    //atributos

    private final String ISBN;
    private String titulo;
    private String autor;
    private int ano;

    //metodos

    public Livro(String ISBN, String titulo, String autor, int ano) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "ISBN='" + ISBN + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                '}';
    }
}

