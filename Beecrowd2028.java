import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Beecrowd2028 {

    public static void main (String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int caso = 1;
        try {
            while (sc.hasNext()) {
                int N = validaEntrada(sc);
                int count = 1;

                List<Integer> lista = preencheLista(N, count);

                // Get count from last index and remove
                count = lista.get(lista.size() - 1);
                lista.remove(lista.size() - 1);

                StringBuilder linha = montaLinha(lista);

                String numero = count == 1 ? "numero" : "numeros";
                System.out.println(
                    String.format("Caso %d: %d %s", caso, count, numero)
                );
                System.out.println(linha);
                System.out.println();
                caso++;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            sc.close();
        }

    }

    private static int validaEntrada(Scanner sc) {
        while(true) {
            int N = Integer.parseInt(sc.nextLine());
            if(N >= 0 && N <= 200) {
                return N;
            }
        }
    }

    private static List<Integer> preencheLista(int N, int count) {
        List<Integer> lista = new ArrayList<>();
        lista.add(0);
        for(int i = 0; i <= N; i++) {
            for(int j = 0; j < i; j++) {
                lista.add(i);
                count++;
            }
        }
        // Add count to last index
        lista.add(count);
        return lista;
    }

    private static StringBuilder montaLinha(List<Integer> lista) {
        StringBuilder linha =  new StringBuilder();
        for(int x : lista) {
            linha.append(x);
            linha.append(" ");
        }
        linha.deleteCharAt(linha.length() - 1);
        return linha;
    }
    
}
