package poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class App {
    static void main() throws InterruptedException {

        Draw draw = new Draw();

        draw.setCanvasSize(800, 800);
        draw.enableDoubleBuffering();

        draw.setYscale(0,800);
        draw.setXscale(0,800);
//
//        draw.circle(400, 400, 100);
//
        draw.setPenColor(Color.BLUE);
//
//        double[] x = {100, 150, 250, 300};
//        double[] y = {100, 150, 150, 100};
//
//        draw.polygon(x, y);

//        for (int i = 0; i < 800; i+=5) {
//            draw.line(i, 0, i, 800);
//            draw.line(0, i, 800, i);
//
//        }

        draw.setFontSize(30);


        for (int i = 0; i < 4; i++) {
            draw.clear();
            draw.text(400, 400,"" + i);
            TimeUnit.SECONDS.sleep(1);
            draw.show();
        }

        draw.clear();
        draw.filledCircle(400, 400, 100);
        draw.filledCircle(600, 400, 100);
//        TODO
//        draw.filledPolygon();


        draw.show();


    }
}
