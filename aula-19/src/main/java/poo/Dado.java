package poo;

import java.util.Random;

public class Dado {
    //        # face : int
    //        # est : int
    //
    //        +jogar() : int

    protected int face;
    protected int est;
    private Random r;

    public Dado() {
        this.face = 0;
        this.r = new Random();
    }


    public int jogar(){
        this.face = r.nextInt(6); //0 a 5
        return (this.face+1);
    }
}
