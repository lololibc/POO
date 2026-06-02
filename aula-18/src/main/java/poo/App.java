package poo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static void main() {

        Scanner ler = new Scanner(System.in);
        int a, b;

        try{
            System.out.println("Entre com n:");
            a = ler.nextInt();
            System.out.println("Entre com n: ");
            b = ler.nextInt();

            int res = a/b;

        }catch (Exception e){
            System.err.println("Apenas num inteiros");
            ler.nextLine();
        }
        System.out.println("Fim do programa");



    }
}
