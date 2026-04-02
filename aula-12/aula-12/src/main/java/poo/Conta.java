package poo;

public class Conta {

    //atributos
    private final String num;
    private final String nome;
    private int saldo;

    //metodos

    //construtor

    public Conta(String num, String nome, int saldo) {
        this.num = num;
        this.nome = nome;
        this.saldo = saldo;
    }


    //getters

    public String getNum() {
        return num;
    }

    public String getNome() {
        return nome;
    }

    public int getSaldo() {
        return saldo;
    }
    //depositar
    public void depositar(int valor){
        this.saldo += valor;
    }

    public void sacar(int valor){
        this.saldo = ((saldo-valor) <0) ? this.saldo : saldo-valor;
    }

    @Override
    public String toString() {
        return String.format("""
                Conta: %s
                Titular: %s
                Saldo: %d
                """, num, nome, saldo);
    }
}
