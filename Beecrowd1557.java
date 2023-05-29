import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Beecrowd1557 {
    
    public static void main (String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        while (true) {
            
            int N = 0;
            while (true) {
                int aux = sc.nextInt();
                if(aux >= 0 && aux <= 15) {
                    N = aux;
                    break;
                }
            }
            
            if (N != 0) {
                if(N == 1) {
                    System.out.println("1");
                    System.out.println("");
                }
                else {
                    List<List<Integer>> M = new ArrayList<>();
                    M = geraMatrizQuadrada(N);
                    imprimeMatrizQuadrada(M);
                }
            }
            else {
                break;
            }
            
        }
        
        sc.close();

    }

    private static void imprimeMatrizQuadrada(List<List<Integer>> M) {
        int T = obtemMaxLength(M);
        for(int i = 0; i < M.size(); i++) {
            String linha = "";
            for(int j = 0; j < M.get(i).size(); j++) {
                if(j != M.get(i).size() - 1) {
                    linha = linha + justifica(M.get(i).get(j), T) + " ";
                }
                else {
                    linha = linha + justifica(M.get(i).get(j), T);
                }
            }
            System.out.println(linha);
        }
        System.out.println("");
    }

    private static String justifica(Integer integer, int maxLength) {
        int initLength = String.valueOf(integer).length();
        if(initLength == maxLength) {
            return String.valueOf(integer);
        }
        else {
            String aux = String.valueOf(integer);
            while (initLength < maxLength) {
                aux = " " + aux;
                initLength++;
            }
            return aux;
        }
    }

    private static int obtemMaxLength(List<List<Integer>> M) {
        int i = M.size() - 1;
        int j = M.get(i).size() - 1;
        String aux = String.valueOf(M.get(i).get(j));
        return aux.length();
    }

    private static List<List<Integer>> geraMatrizQuadrada(int N) {
        List<List<Integer>> matriz = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            int aux = valorLinha(i);
            List<Integer> linha = new ArrayList<>();
            for(int j = 0; j < N; j++) {
                linha.add(aux);
                aux = aux * 2; 
            }
            matriz.add(linha);
        }
        return matriz;
    }

    private static int valorLinha(int i) {
        int aux = 1;
        if(i == 0) {
            return 1;
        }
        else {
            int multiplica = 1;
            while (aux <= i) {
                multiplica = multiplica * 2;
                aux++;
            }
            return multiplica;
        }
    }

}
