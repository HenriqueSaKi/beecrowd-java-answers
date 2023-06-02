import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1478 {

    public static void main (String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);
        while (true) {
            int N = validaEntrada(sc);
            if(N == 0) {
                break;
            }
            else {
                int[][] M = new int[N][N];
                M = geraMatrizQuadrada(0, N, M);
                imprimeMatriz(N, M);
            }
        }
        sc.close();
        
    }

    private static int validaEntrada (Scanner sc) {
        while (true) {
            int x = sc.nextInt();
            if(x >= 0 && x <= 100) {
                return x;
            }
        }
    }

    private static int[][] geraMatrizQuadrada(int inicio, int N, int[][] M) {
        
        int x = 0;
        for(int i = inicio; i < N; i++) {
            int y = 0;
            for(int j = inicio; j < N; j++) {
                M[i][j] = x + y + 1;
                y++;
            }
            x++;
        }

        if(inicio < N) {
            inicio++;
            return geraMatrizQuadrada(inicio, N, M);
        }
        else {
            return M;
        }
    }

    private static void imprimeMatriz(int N, int[][] M) {
        for(int i = 0; i < N; i++) {
            String linha = "";
            for(int j = 0; j < N; j++) {
                if(j == N - 1) {
                    linha = linha + justifica(String.valueOf(M[i][j]));
                }
                else {
                    linha = linha + justifica(String.valueOf(M[i][j])) + " ";
                }
            }
            System.out.println(linha);
        }
        System.out.println();
    }

    private static String justifica(String i) {
        while(true) {
            if(i.length() < 3) {
                i = " " + i;
            }
            else {
                return i;
            }
        }
    }
    
}
