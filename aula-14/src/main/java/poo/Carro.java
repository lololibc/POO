package poo;

public class Carro {
//    class Carro{
//        - String marca
//        + Motor propulsor
//        +Carro(ma: String, mo: Motor)
//        +acelerar(v: int)void
//        +trocarMotor(m: Motor)void
//    }

    private String marca;
    private Motor propulsor;

    public Carro(String ma, Motor mo) {
        this.marca = ma;
        this.propulsor = mo;
    }
    public void acelerar(int v){
        propulsor.acelerar(v);
    }
    public void trocarMotor(Motor m){
        this.propulsor = m;
    }
}
