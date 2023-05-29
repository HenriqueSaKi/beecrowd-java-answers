import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1534 {

    public static void main (String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        try {
            while(sc.hasNextLine()) {
                int N = Integer.parseInt(sc.nextLine());
                if(N >= 3 && N <= 70) {
                    geraMatriz(N);
                }   
            }
        }
        catch (Exception e) {
            sc.close();
        }

    }

    private static void geraMatriz(int N) {
        String[][] M = new String[N][N];
        for(int i = 0; i < N; i++) {
            String linha = "";
            for(int j = 0; j < N; j++) {
                if(i == j) {
                    M[i][j] = "1";
                }
                if(j == N - i - 1) {
                    M[i][j] = "2";
                }
                if(i != j && (j != N - i - 1)) {
                    M[i][j] = "3";
                }
                linha = linha + M[i][j];
            }
            System.out.println(linha);
        }
    }

    
}
