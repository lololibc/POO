package poo;

public class Conta {

    //atributos
    private final int num;
    private final String nome;
    private int saldo;

    //metodos

    //construtor

    public Conta(int num, String nome, int saldo) {
        this.num = num;
        this.nome = nome;
        this.saldo = saldo;
    }


    //getters

    public int getNum() {
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

    public boolean sacar(int valor){
        if(saldo>=valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
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
