import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1924 {

    public static void main (String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = validaCasosTeste(sc);
        for(int i = 0; i < n; i++) {
            if(sc.hasNext()) {
                String curso = sc.next();
            }
        }
        System.out.println("Ciencia da Computacao");

    }

    private static int validaCasosTeste(Scanner sc) {
        while(true) {
            int n = sc.nextInt();
            if(n >= 1 && n <= 2000) {
                return n;
            }
        }
    }
    
}
