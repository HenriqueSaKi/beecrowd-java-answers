import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1234 {
    
    public static void main (String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            String[] sencente = validSentenceLength(sc).split("");
            int pos = 0;

            StringBuilder linha = new StringBuilder();
            for(int i = 0; i < sencente.length; i++) {
                if(!sencente[i].equals(" ")) {
                    pos++;
                    if(pos % 2 != 0) {
                        sencente[i] = sencente[i].toUpperCase();
                    }
                    else {
                        sencente[i] = sencente[i].toLowerCase();
                    }
                }
                linha = linha.append(sencente[i]);
            }
            System.out.println(linha);

        }
        
    }

    private static String validSentenceLength(Scanner sc) {
        while (true) {
            String sentence = sc.nextLine();
            int len = sentence.length();
            if(len >= 1 && len <= 50) {
                return sentence;
            }
        }
    }

}
