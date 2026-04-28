package poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;

public class ColecaoTelefone {
//        -dados: HashMap<String><String>
//        +add(rotulo: String, valor: String)boolean
//        +remove(rotulo: String)boolean
//        +update(rotulo: String, valor: String)boolean
//        +toString()String

    private HashMap<String, String> dados =  new HashMap<>();

    private String formata(String mascara, String valor){
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
        }
        return resultado;
    }

    public boolean add (String rotulo, String valor){
        String eR = "^[0-9]+$";
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
        String eR = "^[0-9]+$";
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
        this.dados.forEach((rotulo, valor) -> {
            resultado.append(rotulo)
                    .append(": ")
                    .append(this.formata("+## (##) #####-####",valor))
                    .append("\n");
        });
        return resultado.toString();
    }
}
