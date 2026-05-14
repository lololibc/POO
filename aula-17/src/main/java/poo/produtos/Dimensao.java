package poo.produtos;

public class Dimensao {
    private int altura;
    private int largura;
    private int profundidade;

    public Dimensao(int profundidade, int largura, int altura) {
        this.profundidade = profundidade;
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Dimensao{" +
                "altura=" + altura +
                ", largura=" + largura +
                ", profundidade=" + profundidade +
                '}';
    }
}
