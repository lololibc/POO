package poo;

import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {


        if (args.length == 0) {
            IO.println("Não forneceu argumentos de linha de comando");
        } else {

            if(args[0].equals("triangulo")){
                int n = Integer.parseInt(args[1]);
                for (int i = 0; i < n; i++) {
                    IO.println("*".repeat(i+1));
                }
            }else if(args[0].equals("losango")){
                IO.print("losango");
            }else if(args[0].equals("retangulo")){
                IO.print("retangulo");
            }else{
                IO.print("Argumento inválido");
            }


        }


    }
}
