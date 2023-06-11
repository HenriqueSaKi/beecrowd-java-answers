import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Beecrowd1957 {

    public static void main (String[] args) throws IOException {

        String[] hex = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();

        List<Integer> listaDec = new ArrayList<>();

        listaDec = retornaListaDec(listaDec, V);
        String saida = "";
        for(int i = 0; i < listaDec.size(); i++) {
            saida = hex[listaDec.get(i)] + saida;
        }

        System.out.println(saida);
        sc.close();

    }

    private static List<Integer> retornaListaDec(List<Integer> listaDec, int V) {
        while(V > 15) {
            listaDec.add(V % 16);
            return retornaListaDec(listaDec, quociente(V));
        }
        listaDec.add(V);
        return listaDec;
    }

    private static int quociente(int V) {
        int aux = new BigDecimal(V / 16).intValue();
        return aux;
    }
    
}
