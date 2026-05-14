package poo.produtos;

public class Telefone {
    protected int codigo;
    protected String numSerie;
    protected String modelo;
    protected double peso;
    protected Dimensao dimensao;


    public Telefone(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.dimensao = dimensao;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "codigo=" + codigo +
                ", numSerie='" + numSerie + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", dimensao=" + dimensao +
                '}';
    }
}
