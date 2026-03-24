package poo;

public class Horario {

    private int hora;
    private int minuto;
    private int segundo;

    public Horario() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Horario(int hora) {
        if(hora < 0 || hora > 23){
            this.hora = 0;
        }else{
            this.hora = hora;
        }
    }

    public Horario(int hora, int minuto) {
        if(hora < 0 || hora > 23 || minuto < 0 || minuto > 59){
            this.hora = 0;
            this.minuto = 0;
        }else{
            this.minuto = minuto;
            this.hora = hora;
        }
    }

    public Horario(int hora, int minuto, int segundo) {
        if(hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59){
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }else{
            this.minuto = minuto;
            this.hora = hora;
            this.segundo = segundo;
        }
    }

    public boolean setHora(int hora) {
        if(hora < 0 || hora > 23){
            return false;
        }else{
            this.hora = hora;
            return true;
        }
    }

    public boolean setMinuto(int minuto) {
        if(minuto < 0 || minuto > 59){
            return false;
        }else{
            this.minuto = minuto;
            return true;
        }
    }

    public boolean setSegundo(int segundo) {
        if(segundo < 0 || segundo > 59){
            return false;
        }else{
            this.segundo = segundo;
            return true;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",hora, minuto, segundo);
    }

    public long horaSegundos(){
        return (hora* 3600L)+(minuto* 60L)+segundo;
    }

    public long diferencaHora(Horario horario){
        return this.horaSegundos() - horario.horaSegundos();
    }

    private String converterParaextenso(int valor){
        return switch (valor){
            case 0 -> "zero";
            case 1 -> "um";
            case 2 -> "dois";
            case 3 -> "três";
            case 4 -> "quatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "sete";
            case 8 -> "oito";
            case 9 -> "nove";
            case 10 -> "dez";
            case 11 -> "onze";
            case 12 -> "doze";
            case 13 -> "treze";
            case 14 -> "quatorze";
            case 15 -> "quinze";
            case 16 -> "dezesseis";
            case 17 -> "dezessete";
            case 18 -> "dezoito";
            case 19 -> "dezenove";
            case 20 -> "vinte";
            case 30 -> "trinta";
            case 40 -> "quarenta";
            case 50 -> "cinquenta";
            default -> "erro";
        };
    }

    public String porExtenso(){
        String horaExt;
        String minExt;
        String segExt;
        if (hora > 20) {
            int d = (hora/10)*10;
            int u = (hora%10);
            horaExt = String.format("%s e %s horas, ", this.converterParaextenso(d), this.converterParaextenso(u));
        }else if(hora != 1){
            horaExt = String.format("%s horas, ", this.converterParaextenso(hora));
        }else{
            horaExt = String.format("%sa hora, ", this.converterParaextenso(hora));
        }
        if (minuto > 20) {
            int d = (minuto/10)*10;
            int u = (minuto%10);
            minExt = String.format("%s e %s minutos e ", this.converterParaextenso(d), this.converterParaextenso(u));
        }else if(minuto != 1){
            minExt = String.format("%s minutos e ", this.converterParaextenso(minuto));
        }else{
            minExt = String.format("%s minuto e ", this.converterParaextenso(minuto));
        }

        if (segundo > 20) {
            int d = (segundo/10)*10;
            int u = (segundo%10);
            segExt = String.format("%s e %s segundos", this.converterParaextenso(d), this.converterParaextenso(u));
        }else if(segundo != 1){
            segExt = String.format("%s segundos", this.converterParaextenso(segundo));
        }else{
            segExt = String.format("%s segundo", this.converterParaextenso(segundo));
        }
        return horaExt + minExt + segExt;

    }



}
