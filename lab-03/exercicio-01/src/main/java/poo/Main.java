package poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Ponto a = new Ponto(1, 2);
        Ponto b = new Ponto(1, 5);

        System.out.println(a.distancia(b));

        System.out.println(a.toString());



    }
}
