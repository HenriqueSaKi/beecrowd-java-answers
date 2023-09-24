import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Beecrowd1248 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < N; i++) {
            String[] planoDieta = sc.nextLine().split("");
            String[] cafeDaManha = sc.nextLine().split("");
            String[] almoco = sc.nextLine().split("");

            String jantar = saldoAlimentosJantar(planoDieta, cafeDaManha, almoco);
            
            
            System.out.println(jantar);
            
        }
        
        sc.close();

    }

    private static String saldoAlimentosJantar(String[] planoDieta, String[] cafeDaManha, String[] almoco) {
        List<String> jantar = new ArrayList<>();
        for(int i = 0; i < planoDieta.length; i++) {
            jantar.add(planoDieta[i]);
        }

        for(int i = 0; i < cafeDaManha.length; i++) {
            if(jantar.contains(cafeDaManha[i]) || cafeDaManha[i].isEmpty()) {
                jantar.remove(cafeDaManha[i]);
            }
            else {
                return "CHEATER";
            }
        }

        for(int i = 0; i < almoco.length; i++) {
            if(jantar.contains(almoco[i]) || almoco[i].isEmpty()) {
                jantar.remove(almoco[i]);
            }
            else {
                return "CHEATER";
            }
        }

        if(!jantar.equals("CHEATER")) {
            Collections.sort(jantar);
        }
        return listToString(jantar);
    }

    private static String listToString (List<String> value) {
        String result = "";
        for (String string : value) {
            result = result + string;
        }
        return result;
    }
    
}
