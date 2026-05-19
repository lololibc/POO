package poo.produtos;

public class SemFio extends Telefone{
    private double frequencia;
    private int canais;
    private double distancia;


    //super: invoca metodo da super classe
    public SemFio(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, double frequencia, int canais, double distancia) {
        super(codigo, numSerie, modelo, peso, dimensao);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distancia = distancia;
    }

    public double getFrequencia() {
        return frequencia;
    }

    //sobrescreve o metodo do pai
    @Override
    public String toString() {
        return super.toString() +
                "frequencia=" + frequencia +
                ", canais=" + canais +
                ", distancia=" + distancia +
                '}';
    }
}
