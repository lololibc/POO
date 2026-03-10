package poo;

public class Caneta {

    // Atributos
    private String cor; //""
    private boolean aberta; //0.0
    private double nivelTinta; //false

    // Métodos

    public String desenhar(int x1, int y1, int x2, int y2){
        if(aberta){
            //calcular distancia
            double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            //debitar do nivel de tinta
            if((distancia * 0.01)< nivelTinta){
                nivelTinta -= distancia * 0.01;
                //retornar distancia percorrida
                return String.format("Desenhei %.2f na cor %s", distancia, cor);
            }else{
                return "Tinta insuficiente";
            }
        }else{
            return "A caneta está fechada";
        }
    }



    public boolean isAberta() {
        return aberta;
    }

    public boolean abrirFechar(){
        aberta = !aberta;
        return aberta;
    }

    public void setCor(String c) {
        cor = c;
    }
    public String getCor(){
        return cor;
    }

    public void setNivelTinta(double n){
        nivelTinta = n;
    }
    public double getNivelTinta(){
        return nivelTinta;
    }




}