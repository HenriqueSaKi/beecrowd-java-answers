import java.io.IOException;
import java.util.Scanner;
 
public class Beecrowd1004 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        System.out.println("PROD = " + (num1 * num2));

        input.close();
 
    }
 
}