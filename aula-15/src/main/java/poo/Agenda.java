package poo;

import java.util.ArrayList;

public class Agenda {
//        -contatos: ArrayList<Contato>
//        +Agenda()
//        +addContato(c: Contato): boolean
//        +findContato(nome: String, sobrenome: String): ArrayList<Contato>
//        +removeContato(indiceContatoNaLista : int): boolean
//        +addTelefone(rotulo: String, valor: String, indiceContatoNaLista : int): boolean
//        +addEmail(rotulo: String, valor: String, indiceContatoNaLista : int): boolean
//        +updateTelefone(rotulo: String, valor: String, indiceContatoNaLista : int): boolean
//        +updateEmail(rotulo: String, valor: String, indiceContatoNaLista : int): boolean
//        +removeTelefone(rotulo: String, indiceContatoNaLista : int): boolean
//        +removeEmail(rotulo: String, indiceContatoNaLista : int): boolean
//        +toString(): String

    private ArrayList<Contato> contatos = new ArrayList<>();

    public Agenda() {
    }

    public boolean addContato(Contato c){
        return contatos.add(c);
    }

    public ArrayList<Contato> findContato(String nome, String sobrenome){
        ArrayList<Contato> contatosAchados = new ArrayList<>();

        for(Contato e : this.contatos){
            if(e.getNome().equals(nome) && e.getSobrenome().equals(sobrenome)){
                contatosAchados.add(e);
            }
        }
        return contatosAchados;
    }
}
