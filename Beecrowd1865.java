import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1865 {

    public static void main (String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();

        for (int i = 0; i < C; i++) {
            String primeiroNome = sc.next();
            int forcaAplicada = sc.nextInt();
            if(!primeiroNome.equalsIgnoreCase("Thor")) {
                System.out.println("N");
            }
            else {
                System.out.println("Y");
            }
        }
        sc.close();

    }
    
}
