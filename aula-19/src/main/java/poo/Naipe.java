package poo;

public enum Naipe {
    OURO(1, "ouro", "o"),
    ESPADA(2, "espada", "e"),
    COPA(3, "copas", "c"),
    PAUS(4, "paus", "p"),
    ;

    public final int valor;
    public final String extenso;
    public final String inicial;

    Naipe(int valor, String extenso, String inicial) {
        this.valor = valor;
        this.extenso = extenso;
        this.inicial = inicial;
    }
}
