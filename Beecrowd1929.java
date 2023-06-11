import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1929 {

    public static void main (String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        boolean ehTriangulo = false;

        ehTriangulo = validaTriangulo(ehTriangulo, A, B, C);
        ehTriangulo = validaTriangulo(ehTriangulo, B, C, D);
        ehTriangulo = validaTriangulo(ehTriangulo, A, B, D);
        ehTriangulo = validaTriangulo(ehTriangulo, A, C, D);

        System.out.println(ehTriangulo ? "S" : "N");

        sc.close();

    }

    private static boolean validaTriangulo(boolean ehTriangulo, int l1, int l2, int l3) {
        if(!ehTriangulo) { 
            int[] listaOrdenada = bubbleSort(l1, l2, l3);
            if(listaOrdenada[0] + listaOrdenada[1] > listaOrdenada[2]) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return true;
        }
    }

    private static int[] bubbleSort(int l1, int l2, int l3) {
        int[] lista = {l1, l2, l3};
        for(int i = 0; i < lista.length; i++) {
            for(int j = i + 1; j < lista.length; j++) {
                if(lista[i] > lista[j]) {
                    int aux = lista[j];
                    lista[j] = lista[i];
                    lista[i] = aux;
                }
            }
        }
        return lista;
    }
    
}
