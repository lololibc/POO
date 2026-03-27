package poo;

import java.util.Objects;

public class Retangulo {
    // atributos

    private int largura;
    private int altura;
    private String codif;

    //metodos
    // resultado = (condição) ? se verdade : se falso


    public Retangulo(String codif, int largura, int altura) {
        if (Objects.equals(codif, "ASCII") || (Objects.equals(codif, "UTF8"))){
            this.codif = codif;
        }else{
            this.codif = "ASCII";
        }

        if(altura > 1 && largura > 1){
            this.largura = largura;
            this.altura = altura;
        }else{
            this.largura = 4;
            this.altura = 3;
        }

    }

    public Retangulo() {
        this.largura = 4;
        this.altura = 3;
        this.codif = "ASCII";
    }

    public boolean setLargura(int largura) {
        if(largura > 1){
            this.largura = largura;
            return true;
        }else{
            return false;
        }
    }

    public boolean setAltura(int altura) {
        if(altura > 1){
            this.altura = altura;
            return true;
        }else{
            return false;
        }
    }

    public boolean setCodif(String codif) {
        if (Objects.equals(codif, "ASCII") || (Objects.equals(codif, "UTF8"))){
            this.codif = codif;
            return true;
        }else{
            return false;
        }
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public String getCodif() {
        return codif;
    }

    public int calcularArea(){
        return altura * largura;
    }
    public int perimetro(){
        return 2*(largura+altura);
    }

    @Override
    public String toString() {

            String esqTopo = "+";
            String dirTopo = "+";
            String meioLarg = "-";
            String meioAlt = "|";
            String esqBaixo = "+";
            String dirBaixo = "+";
            if (Objects.equals(codif, "UTF8")){
                esqTopo = "\u250c";
                dirTopo = "\u2510";
                meioLarg = "\u2500";
                meioAlt = "\u2502";
                esqBaixo = "\u2514";
                dirBaixo = "\u2518";
            }




            String linhaTopo = esqTopo + meioLarg.repeat(largura-2) + dirTopo + "\n";
            String linhaBaixo = esqBaixo + meioLarg.repeat(largura-2) + dirBaixo + "\n";
            if(altura>2){
                String linhaMeio = (meioAlt + " ".repeat(largura-2) + meioAlt + "\n").repeat(altura-2);
                return linhaTopo + linhaMeio + linhaBaixo;
            }else{
                return linhaTopo + linhaBaixo;
            }


    }
}
