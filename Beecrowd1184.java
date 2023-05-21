import java.util.Scanner;

public class Beecrowd1184 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String O = sc.next();

        double[][] M = new double[12][12];
        preencheMatriz(sc, M);

        if(O.equalsIgnoreCase("S")) {
            System.out.println(String.format("%.1f", somaValoresAbaixoDiagonalPrincipal(M)));
        }
        else {  
            System.out.println(String.format("%.1f", mediaValoresAbaixoDiagonalPrincipal(M)));
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

    private static double somaValoresAbaixoDiagonalPrincipal(double[][] M) {
        double soma = 0;
        for(int i = 1; i < 12; i++) {
            for(int j = 0; j < i; j++) {
                soma = soma + M[i][j];
            }
        }
        return soma;
    }

    private static double mediaValoresAbaixoDiagonalPrincipal(double[][] M) {
        double soma = 0;
        int count = 0;
        for(int i = 1; i < 12; i++) {
            for(int j = 0; j < i; j++) {
                soma = soma + M[i][j];
                count++;
            }
        }
        return soma / count;
    }

}
