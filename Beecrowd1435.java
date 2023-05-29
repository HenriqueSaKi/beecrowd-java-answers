import java.util.Scanner;

public class Beecrowd1435 {

    public static void main (String[] args) {
        
        while (true) {
            Scanner sc = new Scanner(System.in);
            int N = validaEntrada(sc);

            if (N != 0) {
                geraMatrizQuadrada(N);
            }
            else {
                break;
            }
        }

    }

    private static int validaEntrada(Scanner sc) {
        while (true) {
            int N = sc.nextInt();
            if(N >= 0 && N <= 100) {
                return N;
            }
        }
    }
    
}
