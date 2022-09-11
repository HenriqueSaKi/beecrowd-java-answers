import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1002 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();

        double result = 3.14159 * x * x;
        
        System.out.println("A=" + String.format("%.4f",result));

        input.close();
 
    }
 
}