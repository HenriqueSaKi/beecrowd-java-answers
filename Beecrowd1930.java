import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1930 {

    public static void main (String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for(int i = 0; i < 4; i++) {
            if(i < 3) {
                soma += sc.nextInt() - 1;
            }
            else {
                soma += sc.nextInt();
            }
        }

        System.out.println(String.valueOf(soma));

        sc.close();

    }
    
}
