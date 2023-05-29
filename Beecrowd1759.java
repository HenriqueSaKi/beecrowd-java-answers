import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1759 {
    
    public static void main (String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = validaEntrada(sc);
        StringBuffer saida = montaSaida(N);
        System.out.println(saida);

    }

    private static int validaEntrada(Scanner sc) {
        while(true) {
            int i = sc.nextInt();
            if(i > 0 && i <= Math.pow(10, 6)){
                return i;
            }
        }
    }

    private static StringBuffer montaSaida(int N) {
        StringBuffer saida = new StringBuffer("");
        for (int i = 0; i < N - 1; i++) {
            saida.append("Ho ");
        }
        saida.append("Ho!");
        return saida;
    }

}
