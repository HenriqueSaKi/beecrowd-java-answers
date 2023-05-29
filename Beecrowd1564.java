import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1564 {
    
    public static void main (String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        try {
            while(sc.hasNextLine()) {
                int N = validaEntrada(sc);
                if(N == 0) {
                    System.out.println("vai ter copa!");
                }
                else {
                    System.out.println("vai ter duas!");
                }
            }
        }
        catch (Exception e) {
            sc.close();
        }

    }

    private static int validaEntrada(Scanner sc) {
        while (true) {
            int i = sc.nextInt();
            if (i >= 0 && i <= 100) {
                return i;
            }
        }
    }

}
