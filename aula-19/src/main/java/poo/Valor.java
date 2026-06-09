package poo;

public enum Valor {
    AS(1, "às", "1"),
    DOIS(2, "dois", "2"),
    TRES(3, "tres", "3"),
    QUATRO(4, "quatro", "4"),
    CINCO(5, "cinco", "5"),
    SEIS(6, "seis", "6"),
    SETE(7, "sete", "7"),
    OITO(8, "oito", "8"),
    NOVE(9, "nove", "9"),
    DEZ(10, "dez", "10"),
    VALETE(11, "valete", "j"),
    DAMA(12, "dama", "q"),
    REI(13, "rei", "k"),
    ;

    public final int valor;
    public final String extenso;
    public final String inicial;

    Valor(int valor, String extenso, String inicial) {
        this.valor = valor;
        this.extenso = extenso;
        this.inicial = inicial;
    }
}
