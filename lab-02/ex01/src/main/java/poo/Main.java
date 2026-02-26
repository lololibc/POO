package poo;

import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        // 1. Estação do ano.

        int dia = Integer.parseInt(IO.readln("Entre com um dia: "));
        String mes = IO.readln("Entre com um mês: ");

        // Outono: 20 de março a 20 de junho
        // Inverno: 21 de junho a 22 de setembro
        // Primavera: 23 de setembro a 21 de dezembro
        // Verão: 22 de dezembro a 20 de março

        if(dia <= 0 || dia > 31){
            System.out.println("Dia inválido");
        }

        if ((Objects.equals(mes, "abril")) || (Objects.equals(mes, "maio")) || (dia>= 20 && Objects.equals(mes, "março")) || (Objects.equals(mes, "junho") && dia <= 20 )){
            System.out.println("Outono");
        }else if ((Objects.equals(mes, "julho")) || (Objects.equals(mes, "agosto")) ||(dia>= 21 && Objects.equals(mes, "junho")) || (Objects.equals(mes, "setembro") && dia <= 22 )){
            System.out.println("Inverno");
        }else if ((Objects.equals(mes, "outubro")) || (Objects.equals(mes, "novembro")) ||(dia>= 23 && Objects.equals(mes, "setembro")) || (Objects.equals(mes, "dezembro") && dia <= 21 )){
            System.out.println("Outono");
        }else if ((Objects.equals(mes, "janeiro")) || (Objects.equals(mes, "fevereiro")) ||(dia>= 22 && Objects.equals(mes, "dezembro")) || (Objects.equals(mes, "março") && dia <= 20 )){
            System.out.println("Outono");
        }else{
            System.out.println("Mês inválido");
        }

        }

    }

