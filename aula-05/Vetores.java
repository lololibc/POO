public class Vetores {
    public static void main(String[] args) {

        // um vetor em Java é um objeto
        // int[] vetor = new int[5];

        // int[] outra = {3, 4, 5, 8};

        // int tamanho = vetor.length;

        // vetor[0] = 10;
        // vetor[4] = 90;

        // int[][] matriz = new int [3][2]; //lin, col

        // int[] vetor = new int[100];
        // vetor[0] = 3;

        // for(int i = 1; i<100; i++){
        // vetor[i] = vetor[i-1] + 2;
        // System.out.println(vetor[i]);
        // }
        // for(int i=0; i<100; i++){
        // if (n%2 == 0){
        // n++;
        // }



        // vetor[i] = n;
        // System.out.println(vetor[i]);
        // n++;
        // }

        // int[][] matriz = new int [3][3];
        // int n = 1;

        // for (int i = 0; i < matriz.length; i++) {
        // System.out.println();
        // for(int j = 0; j < 3; j++ ){
        // matriz[i][j] = n++;
        // System.out.print(matriz[i][j] + " ");
        // }

        // }

        // for(int i = 0; i < 3; i++){
        // System.out.println();
        // for(int j = 0; j< 3; j++){
        // if(i == j){
        // System.out.print(matriz[i][j]);
        // }else{
        // System.out.print(" ");
        // }
        // }

        // }

        int[][] matriz2 = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        // Usando for tradicional
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.println(matriz2[i][j]);
            }
        }
        // Usando for−each
        for (int[] linha : matriz2) {
            for (int valor : linha) {
                System.out.println(valor);
            }
        }



    }
}
