import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1018 {

  private static int analisaCedulas (int N, int nota, String mensagem) {
    double quantidade = 0;
    if (N / nota >= 1) {
      double roundedValue = N - (N % nota);
      quantidade = roundedValue / nota;
      N = N % nota;
    } 
    System.out.println((int) quantidade + mensagem);
    return N;
  }

  public static void main(String[] args) throws IOException {

    Scanner input = new Scanner(System.in);
    int N = input.nextInt();

    System.out.println(N);

    N = analisaCedulas(N, 100, " nota(s) de R$ 100,00");
    N = analisaCedulas(N, 50, " nota(s) de R$ 50,00");
    N = analisaCedulas(N, 20, " nota(s) de R$ 20,00");
    N = analisaCedulas(N, 10, " nota(s) de R$ 10,00");
    N = analisaCedulas(N, 5, " nota(s) de R$ 5,00");
    N = analisaCedulas(N, 2, " nota(s) de R$ 2,00");
    N = analisaCedulas(N, 1, " nota(s) de R$ 1,00");

    input.close();

  }

}