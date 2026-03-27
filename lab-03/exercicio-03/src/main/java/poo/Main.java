package poo;

public class Main {
    static void main() {
        Retangulo a = new Retangulo("UTF8", 4, 4);

        System.out.println(a.calcularArea());
        System.out.println(a.perimetro());

        System.out.println(a.toString());

    }
}
