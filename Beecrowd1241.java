import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1241 {

    public static void main (String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < N; i++) {

            String sentence = sc.nextLine();
            String A = sentence.split(" ")[0];
            String B = sentence.split(" ")[1];

            int lengthA = A.length();
            int lengthB = B.length();
            if(lengthA >= lengthB) {
                if(A.substring(lengthA - lengthB, lengthA).equalsIgnoreCase(B)) {
                    System.out.println("encaixa");
                }
                else {
                    System.out.println("nao encaixa");
                }
            }
            else {
                System.out.println("nao encaixa");
            }

        }
        sc.close();

    }
    
}
