import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1864 {

    public static final String FRASE = "LIFE IS NOT A PROBLEM TO BE SOLVED";

    public static void main (String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int N = validaEntrada(sc);

        String output = "";
        for(int i = 0; i < N; i++) {
            output = output + FRASE.charAt(i);
        }
        System.out.println(output);

    }

    private static int validaEntrada(Scanner sc) {
        while (true) {
            int N = sc.nextInt();
            if (N >= 1 && N <= 34) {
                return N;
            }
        }
    }
    
}