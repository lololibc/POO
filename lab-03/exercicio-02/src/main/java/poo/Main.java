package poo;

import java.sql.SQLOutput;

public class Main {
    static void main() {


        Horario a = new Horario(21, 12, 33);
        Horario b = new Horario(1, 50, 30);
        System.out.println(a.toString());
        System.out.println(a.setMinuto(90));
        System.out.println(a.horaSegundos());

        System.out.println(a.diferencaHora(b));
        System.out.println(a.porExtenso());



    }
}
