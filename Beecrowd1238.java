import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1238 {

    public static void main (String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < N; i++) {
            String[] cadeias = sc.nextLine().split(" ");
            cadeiaResultante(cadeias);
        }

        sc.close();

    }

    private static void cadeiaResultante(String[] cadeias) {

        String[] cadeiaPar = cadeias[0].split("");
        String[] cadeiaImpar = cadeias[1].split("");

        int tamCadeiaPar = cadeiaPar.length;
        int tamCadeiaImpar = cadeiaImpar.length;

        int par = 0;
        int impar = 0;
        String resultante = "";
        while (true) {
            if (par < tamCadeiaPar && impar < tamCadeiaImpar) {
                resultante = resultante + cadeiaPar[par++] + cadeiaImpar[impar++];
            }
            else if (par < tamCadeiaPar) {
                resultante = resultante + cadeiaPar[par++];
            }
            else if (impar < tamCadeiaImpar) {
                resultante = resultante + cadeiaImpar[impar++];
            }
            else {
                System.out.println(resultante);
                break;
            }
        }

    }
    
}
