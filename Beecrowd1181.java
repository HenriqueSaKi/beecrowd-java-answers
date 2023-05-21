import java.text.DecimalFormat;
import java.util.Scanner;

public class Beecrowd1181 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int linha = validaEntradaLinha(sc);
        
        String T = validaEntradaOperacao(sc);

        float[][] M = new float[12][12];

        for (int i = 0; i < 12; i++) {
            for(int j = 0; j < 12; j++) {
                M[i][j] = sc.nextFloat();
            }
        }

        if (T.equalsIgnoreCase("S")) {
            calculaSoma(M, linha);
        }
        if (T.equalsIgnoreCase("M")) {
            calculaMedia(M, linha);
        }

        sc.close();
    }

    private static int validaEntradaLinha (Scanner sc) {
        while (true) {
            int aux = sc.nextInt();
            if(aux >= 0 && aux <= 11) {
                return aux;
            }
        }
    }

    private static String validaEntradaOperacao(Scanner sc) {
        while(true) {
            String aux = sc.next();
            if(aux.equalsIgnoreCase("S") || 
                aux.equalsIgnoreCase("M")){
                return aux;
            }
        }
    }

    private static void calculaSoma (float[][] M, int linha) {
        DecimalFormat df = new DecimalFormat("0.0");
        float soma = 0;
        for(int i = 0; i < 12; i++) {
            soma = soma + M[linha][i];
        }
        System.out.println(df.format(soma));
    }

    private static void calculaMedia (float[][] M, int linha) {
        DecimalFormat df = new DecimalFormat("0.0");
        float soma = 0;
        for(int i = 0; i < 12; i++) {
            soma = soma + M[linha][i];
        }
        System.out.println(df.format(soma/12));
    }
    
}
