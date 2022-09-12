import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Beecrowd1235 {

    private static String deDentroParaFora (String frase) {

        String fraseFormatada = "";
        String parte1 = frase.substring(0, frase.length() / 2);
        String parte2 = frase.substring((frase.length() / 2), frase.length());

        parte1 = inverteString(parte1);
        parte2 = inverteString(parte2);

        fraseFormatada = parte1 + parte2;

        return fraseFormatada;

    }

    private static String inverteString (String parte) { 

        String parteFormatada = "";

        for (int i = parte.length() - 1; i >= 0; i--) {
            parteFormatada = parteFormatada + parte.charAt(i);
        }

        return parteFormatada;

    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int casosTeste = input.nextInt();

        List<String> frases = new ArrayList<String>();

        for (int i = 0; i <= casosTeste; i++) {
            frases.add(input.nextLine());
        }
        frases.remove(0);

        for (String frase : frases) {
            System.out.println(deDentroParaFora(frase));
        }

        input.close();

    }
}
