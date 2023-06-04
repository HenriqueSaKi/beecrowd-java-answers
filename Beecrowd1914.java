import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Beecrowd1914 {

    public static void main (String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);
        int QT = validaCasosTeste(sc);

        for(int i = 0; i < QT; i++) {
            String nome1 = sc.next();
            String escolha1 = sc.next();
            String nome2 = sc.next();
            String escolha2 = sc.next();

            Map<String, String> escolha = new HashMap<>();
            escolha.put(escolha1, nome1);
            escolha.put(escolha2, nome2);

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int soma = num1 + num2;

            if(soma % 2 == 0) {
                System.out.println(escolha.get("PAR"));
            } 
            else {
                System.out.println(escolha.get("IMPAR"));
            }

        }

    }

    private static int validaCasosTeste(Scanner sc) {
        while (true) {
            int QT = sc.nextInt();
            if(QT >= 1 && QT <= 100){
                return QT;
            }
        }
    }
    
}
