package poo;

import java.util.HashMap;

public class ColecaoEmail {
//        -dados: HashMap<String><String>
//        +add(rotulo: String, valor: String)boolean
//        +remove(rotulo: String)boolean
//        +update(rotulo: String, valor: String)boolean
//        +toString()String

    private HashMap<String, String> dados =  new HashMap<>();

    public boolean add (String rotulo, String valor){
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if(!dados.containsKey(rotulo) && valor.matches(eR)){
            dados.put(rotulo, valor);
            return true;
        }else{
            return false;
        }

    }

    public boolean remove (String rotulo){
        if (dados.containsKey(rotulo)){
            dados.remove(rotulo);
            return true;
        }else{
            return false;
        }

    }

    public boolean update(String rotulo, String valor){
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if(dados.containsKey(rotulo) && valor.matches(eR)){
            dados.put(rotulo, valor);
            return true;
        }else{
            return false;
        }

    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();

        dados.forEach((rotulo, valor) -> {
            resultado.append(rotulo)
                    .append(": ")
                    .append(valor)
                    .append("\n");
        });

        return resultado.toString();
    }




}
