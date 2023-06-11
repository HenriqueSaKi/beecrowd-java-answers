import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1984 {

    public static void main (String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        String numero = String.valueOf(n);
        String numeroInvertido = "";
        for(int i = 0; i < numero.length(); i++) {
            numeroInvertido = numero.charAt(i) + numeroInvertido;
        }
        System.out.println(numeroInvertido);

        sc.close();
    }
    
}
