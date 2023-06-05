import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1866 {

    public static void main (String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int C = validaCasosTeste(sc);
        for(int i = 0; i < C; i++) {
            int N = sc.nextInt();
            int S = N % 2 == 0 ? 0 : 1;
            System.out.println(String.valueOf(S));
        }

    }

    private static int validaCasosTeste(Scanner sc) {
        while(true) {
            int N = sc.nextInt();
            if(N >= 1 && N <= 1000) {
                return N;
            }
        }
    }
    
}
