import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Beecrowd1158 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            List<Integer> aux = listaImpares(X, Y);
            System.out.println(String.valueOf(somaValores(aux)));
        }

        sc.close();

    }

    private static int somaValores(List<Integer> aux) {
        int soma = 0;
        for(int i = 0; i < aux.size(); i++) {
            soma = soma + aux.get(i);
        }
        return soma;
    }

    private static List<Integer> listaImpares(int X, int Y) {
        List<Integer> auxList = new ArrayList<>();
        int auxInt = X;
        while (auxList.size() < Y) {
            if(auxInt % 2 != 0) {
                auxList.add(auxInt);
            }
            auxInt++;
        }
        return auxList;
    }
    
}
