import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Beecrowd1179 {
    
    public static void main(String[] args) {

        List<Integer> par = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 15; i++) {
            int aux = sc.nextInt();
            if (aux % 2 == 0) {
                par.add(aux);
            } 
            else {
                impar.add(aux);
            }
            verificaParPreenchido(par);
            verificaImparPreenchido(impar);
        }

        imprimeRestanteNaoNulo(impar, "impar");
        imprimeRestanteNaoNulo(par, "par");
    
        sc.close();

    }

    private static void imprimeRestanteNaoNulo(List<Integer> vetor, String parImpar) {
        if(!vetor.isEmpty()) {
            if(parImpar.equalsIgnoreCase("par")) {
                for(int i = 0; i < vetor.size(); i++) {
                    imprimePar(i, vetor.get(i));
                }
            }
            else {
                for(int i = 0; i < vetor.size(); i++) {
                    imprimeImpar(i, vetor.get(i));
                }
            }
        }
    }

    private static void verificaParPreenchido(List<Integer> par) {
        if (par.size() == 5) {
            for (int i = 0; i < par.size(); i++) {
                imprimePar(i, par.get(i));
            }
            par.clear();
        }
    }

    private static void verificaImparPreenchido(List<Integer> impar) {
        if (impar.size() == 5) {
            for (int i = 0; i < impar.size(); i++) {
                imprimeImpar(i, impar.get(i));
            }
            impar.clear();
        }
    }

    private static void imprimePar(int i, Integer integer) {
        System.out.println("par[" + String.valueOf(i) + "] = " + String.valueOf(integer));
    }

    private static void imprimeImpar(int i, Integer integer) {
        System.out.println("impar[" + String.valueOf(i) + "] = " + String.valueOf(integer));
    }

}
