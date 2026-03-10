package poo;

public class Main {

    static void main(String[] args) {

        Caneta bic = new Caneta();
        bic.setCor("azul");
        bic.setNivelTinta(0);

        String cor = bic.getCor();
        double nivelTinta = bic.getNivelTinta();

        bic.abrirFechar();
        System.out.println(bic.desenhar(2,2, 4, 4));
        System.out.println(bic.getNivelTinta());

//        Lampada a = new Lampada();
//        Lampada b = new Lampada();
//
//        a.apertarInterruptor();
//
//        System.out.println(a.isLigada());
//        System.out.println(b.isLigada());

    }
}
