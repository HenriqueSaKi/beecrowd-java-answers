import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1189 {

    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String O = sc.next();

        double[][] M = new double[12][12];
        preencheMatriz(sc, M);

        if(O.equalsIgnoreCase("S")) {
            System.out.println(String.format("%.1f", somaValoresAreaEsquerda(M)));
        }
        else {  
            System.out.println(String.format("%.1f", mediaValoresAreaEsquerda(M)));
        }

        sc.close();
    }

    private static void preencheMatriz(Scanner sc, double[][] M) {
        for(int i = 0; i < 12; i++)  {
            for(int j = 0; j < 12; j++) {
                M[i][j] = sc.nextDouble();
            }
        }
    }

    private static double somaValoresAreaEsquerda(double[][] M) {
        double soma = 0;
        for(int i = 0; i < 5; i++)  {
            for(int j = 1 + i; j < 11 - i; j++) {
                soma = soma + M[j][i];
            }
        }
        return soma;
    }

    private static double mediaValoresAreaEsquerda(double[][] M) {
        double soma = 0;
        int count = 0;
        for(int i = 0; i < 5; i++)  {
            for(int j = 1 + i; j < 11 - i; j++) {
                soma = soma + M[j][i];
                count++;
            }
        }
        return soma / count;
    }

}
