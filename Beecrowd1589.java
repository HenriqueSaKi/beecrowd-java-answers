import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1589 {
    
    public static void main (String[] args) throws IOException{ 

        Scanner sc = new Scanner(System.in);
        int T = validaQtdeCasosTeste(sc);;
        for(int i = 0; i < T; i++) {
            int R1 = sc.nextInt();
            int R2 = sc.nextInt();
            System.out.println(String.valueOf(R1 + R2));
        }

    }

    private static int validaQtdeCasosTeste(Scanner sc) {
        while(true) {
            int i = sc.nextInt();
            if(i >= 0 && i <= 10000) {
                return i;
            }
        }
    }

}
