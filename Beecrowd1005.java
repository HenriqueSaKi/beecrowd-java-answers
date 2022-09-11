import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1005 {

  public static void main(String[] args) throws IOException {

    Scanner input = new Scanner(System.in);
    double a = input.nextDouble();
    double b = input.nextDouble();

    double answer = ((a * 3.5) + (b * 7.5)) / 11;

    System.out.println("MEDIA = " + String.format("%.5f", answer));

    input.close();

  }

}