package poo;

import java.util.Random;

public class Main {
    static void main() {

        Random r = new Random();

        int i = r.nextInt(1, 101);


        int contador = 1;
        int n=0;

        do{
            n = Integer.parseInt(IO.readln("Entre com um número: "));

            if (i == n){
                IO.println("Parabéns, você acertou em "+contador+ " tentativa(s)!");
            }else{
                contador++;
                if(i>n){
                    IO.println("O número "+n+ " é menor que o sorteado, tente novamente!");
                }else{
                    IO.println("O número "+n+ " é maior que o sorteado, tente novamente!");
                }
            }

        }while (i != n);






    }
}
