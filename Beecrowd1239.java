import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1239 {

    public static void main (String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            String sentence = sc.nextLine();
            sentence = verificaSubstitui(sentence, "_");
            sentence = verificaSubstitui(sentence, "*");
            System.out.println(sentence);

        }
        sc.close();

    }

    private static String verificaSubstitui(String sentence, String simbolo) {
        String[] caracteres = sentence.split("");
        int count = 0;
        String newString = "";
        for(int i = 0; i < caracteres.length; i++) {
            if(caracteres[i].equalsIgnoreCase(simbolo)) {
                if(count % 2 == 0) {
                    caracteres[i] = simbolo.equalsIgnoreCase("_") ? "<i>" : "<b>";
                }
                else {
                    caracteres[i] = simbolo.equalsIgnoreCase("_") ? "</i>" : "</b>";
                }
                count++;
            }
            newString = newString + caracteres[i];
        }
        return newString;
    }
    
}
