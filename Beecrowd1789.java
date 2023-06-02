import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1789 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        try {
            while(sc.hasNextLine()) {
                int L = validaEntrada(sc);
                int[] V = new int[L];

                for(int i = 0; i < L; i++) {
                    V[i] = sc.nextInt();
                }

                int x = maisRapida(V);
                imprimeNivel(x);
            }
        }
        catch (Exception e) {
            sc.close();
        }
    }

    private static int validaEntrada(Scanner sc) {
        while (true) {
            int i = sc.nextInt();
            if(i >= 1 && i <= 500) {
                return i;
            }
        }
    }

    private static int maisRapida(int[] V) {
        for(int i = 0; i < V.length; i++) {
            int aux = 0;
            for(int j = i + 1; j < V.length; j++) {
                if(V[i] > V[j]) {
                    aux = V[j];
                    V[j] = V[i];
                    V[i] = aux;
                }
            }
        }
        return V[V.length - 1];
    }

    private static void imprimeNivel(int x) {
        if(x < 10) {
            System.out.println("1");
        }
        if(x >= 10 && x < 20) {
            System.out.println("2");
        }
        if(x >= 20) {
            System.out.println("3");
        }
    }

}
