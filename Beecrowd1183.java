import java.util.Scanner;

public class Beecrowd1183 {

    private static double somaValores (double[][] M) {
        double resultado = 0;

        for(int i = 0; i < 11; i++){
            for(int j = i + 1; j < 12; j++){
                resultado = resultado + M[i][j];
            }
        }

        return resultado;
    }

    private static double mediaDosValores (double[][] M) {
        double resultado = 0;
        int quantidade = 0;

        for(int i = 0; i < 11; i++){
            for(int j = i + 1; j < 12; j++){
                resultado = resultado + M[i][j];
                quantidade = quantidade + 1;
            }
        }
        resultado = resultado / quantidade;

        return resultado;
    }


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String O = input.nextLine();
        double[][] M = new double[12][12];

        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                M[i][j] = input.nextDouble();;
            }
        }

        double resultado = 0;
        if(O.equalsIgnoreCase("S")){
            resultado = somaValores(M);
        }

        if(O.equalsIgnoreCase("M")){
            resultado = mediaDosValores(M);
        }

        System.out.println(String.format("%.1f", resultado));

        input.close();
        
    }
}
