package poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Contato {
//        -nome: String
//        -sobrenome: String
//        -dataNasc: LocalDate
//        -telefones: colecaoTelefone
//        -emails: colecaoEmail
//        +Contato(nome: String, sobrenome: String, dN : LocalDate)
//        +addTelefone(rotulo: String, valor: String): boolean
//        +addEmail(rotulo: String, valor: String): boolean
//        +removeTelefone(rotulo : String): boolean
//        +removeEmail(rotulo: String): boolean
//        +updateTelefone(rotulo: String, valor: String): boolean
//        +updateEmail(rotulo: String, valor: String): boolean
//        +toString(): String

    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private ColecaoTelefone telefones;
    private ColecaoEmail emails;

    public Contato(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
    }

    public boolean addTelefone(String rotulo, String valor){
        return telefones.add(rotulo, valor);
    }
    public boolean addEmail(String rotulo, String valor){
        return emails.add(rotulo, valor);
    }

    public boolean removeTelefone(String rotulo){
        return telefones.remove(rotulo);
    }
    public boolean removeEmail(String rotulo){
        return emails.remove(rotulo);
    }

    public boolean updateTelefone(String rotulo, String valor){
        return telefones.update(rotulo, valor);
    }
    public boolean updateEmail(String rotulo, String valor){
        return emails.update(rotulo, valor);
    }

    @Override
    public String toString() {
        return "Contato:" +
                "Nome='" + nome + '\'' +
                ", Sobrenome='" + sobrenome + '\'' +
                ", Data Nascimento=" + dataNasc +
                ", Telefones: " + telefones.toString() +
                ", emails: " + emails.toString();
    }
}
