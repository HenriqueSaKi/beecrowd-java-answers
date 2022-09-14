import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Beecrowd1120 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String entrada = "";

        List<String> saida = new ArrayList<String>();
        
        while (true) {

            entrada = sc.nextLine();

            String numeroProblema = entrada.split(" ")[0];
            String numeroNegociado = entrada.split(" ")[1];

            if (numeroProblema.equals("0") && 
                numeroNegociado.equals("0")) {
                break;
            }

            saida.add(formataNumero(numeroProblema, numeroNegociado));

        }

        for (int i = 0; i < saida.size(); i++) { 
            System.out.println(saida.get(i));
        }

        sc.close();

    }

    private static String formataNumero (String numeroProblema, String numeroNegociado) {

        String[] listaNumeroNegociado = numeroNegociado.split("");
        String impresso = "";
        for(int i = 0; i < listaNumeroNegociado.length; i++) { 
             if (!listaNumeroNegociado.equals("0") &&
                    !listaNumeroNegociado[i].equals(numeroProblema)) {
                impresso = impresso + listaNumeroNegociado[i];
            }
            if(impresso.equals("0")) { 
                impresso = "";
            }
        }

        if(impresso.equals("")){
            return "0";
        }

        return impresso;

    } 

}