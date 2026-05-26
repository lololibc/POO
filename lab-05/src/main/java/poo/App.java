package poo;
import edu.princeton.cs.algs4.Draw;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws Exception {
        Draw desenho = new Draw();
        desenho.setCanvasSize(800, 800);
        desenho.setXscale(0, 800);
        desenho.setYscale(0, 800);
// Toda ação de desenho acontecerá em um buffer secundário
// e esse buffer só será visto depois que for invocado o método show()
        desenho.enableDoubleBuffering();
        for (int i = 1; i <= 10; i++) {
// limpando a área de desenho
            desenho.clear();
// escrevendo o valor de i na coordenada (500,500)
            desenho.text(500, 500, ""+ i);
// Trocando o buffer para exibir o que foi escrito
            desenho.show();
// Dormindo por 1 segundo
            TimeUnit.SECONDS.sleep(1);
        }










    }
}
