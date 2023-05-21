import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Beecrowd1160 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < T; i++) {
            String linha = br.readLine();
            String[] valores = linha.split(" ");

            int PA = valores[0].contains(".") ? 
                (int) Float.valueOf(valores[0]).floatValue() : 
                Integer.valueOf(valores[0]);
            int PB = valores[1].contains(".") ? 
                (int) Float.valueOf(valores[1]).floatValue() : 
                Integer.valueOf(valores[1]);
            float G1 = Float.valueOf(valores[2]);
            float G2 = Float.valueOf(valores[3]); 
            int anos = 1;
            
            System.out.println(calculaAnosParaPassarB(PA, PB, G1, G2, anos));
        }
        sc.close();
    }

    private static String calculaAnosParaPassarB (int PA, int PB, float G1, float G2, int anos) {
        int anoA = calculaPopulacao(PA, G1);
        int anoB = calculaPopulacao(PB, G2);
        if (anos > 100) {
            return "Mais de 1 seculo.";
        }
        else {
            if (anoA <= anoB) {
                anos++;
                return calculaAnosParaPassarB(anoA, anoB, G1, G2, anos);
            }
            if (anoA > anoB) {
                return String.valueOf(anos) + " anos.";
            } 
        }
        return null;
    }

    private static int calculaPopulacao (int x, float y) {
        return (int) (x+((x*y)/100));
    }
    
}
