import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Beecrowd1022 {

    public static void main(String[] args) {
        
        Scanner intSc = new Scanner(System.in);
        Scanner textSc = new Scanner(System.in);

        int casosTeste = intSc.nextInt();

        List<String> respostas = new ArrayList<String>();

        for (int i = 0; i < casosTeste; i++) {

            String linhaTexto = textSc.nextLine();
            linhaTexto = linhaTexto.trim();
            String[] subdivisao = linhaTexto.split(" ");

            System.out.println(subdivisao.length);

            int N1 = Integer.parseInt(subdivisao[0]);
            int D1 = Integer.parseInt(subdivisao[2]);

            int N2 = Integer.parseInt(subdivisao[4]);
            int D2 = Integer.parseInt(subdivisao[6]);
            
            String operacao = subdivisao[3];
            String retornoExpressao = "";

            if (operacao.equals("+")) {
                retornoExpressao = soma(N1, D1, N2, D2);
            }

            if (operacao.equals("-")) {
                retornoExpressao = subtracao(N1, D1, N2, D2);
            }

            if (operacao.equals("*")) {
                retornoExpressao = multiplicacao(N1, D1, N2, D2);
            }

            if (operacao.equals("/")) {
                retornoExpressao = divisao(N1, D1, N2, D2);
            }

            String[] valores = retornoExpressao.split("/");
            N1 = Integer.parseInt(valores[0]);
            D1 = Integer.parseInt(valores[1]);

            String valorSimplificado = valorSimplificado(N1, D1);

            respostas.add(retornoExpressao + " = " + valorSimplificado);

        }

        for(String resposta : respostas) {
            System.out.println(resposta);
        }

        intSc.close();
        textSc.close();

    }

    //Soma: (N1*D2 + N2*D1) / (D1*D2)
    private static String soma (int N1, int D1, int N2, int D2) {
        return (N1 * D2 + N2 * D1) + "/" + (D1 * D2);
    }

    
    //Subtração: (N1*D2 - N2*D1) / (D1*D2)
    private static String subtracao (int N1, int D1, int N2, int D2) {
        return (N1 * D2 - N2 * D1)  + "/" + (D1 * D2);
    }

    //Multiplicação: (N1*N2) / (D1*D2)
    private static String multiplicacao (int N1, int D1, int N2, int D2) {
        return (N1 * N2) + "/" + (D1 * D2);
    }

    //Divisão: (N1/D1) / (N2/D2), ou seja (N1*D2)/(N2*D1)
    private static String divisao (int N1, int D1, int N2, int D2) {
        return (N1 * D2) + "/" + (N2 * D1);
    }

    private static String valorSimplificado (int N1, int D1) {

        int v1 = N1;
        int v2 = D1;
        boolean simplifica = true;

        while (simplifica) {
            if(v1 % 2 == 0 && v2 % 2 == 0) {
                v1 = v1 / 2;
                v2 = v2 / 2;
            }
            else if(v1 % 3 == 0 && v2 % 3 == 0) {
                v1 = v1 / 3;
                v2 = v2 / 3;
            }
            else if(v1 % 5 == 0 && v2 % 5 == 0) {
                v1 = v1 / 5;
                v2 = v2 / 5;
            }
            else {
                simplifica = false;
            }
        }

        return v1 + "/" + v2;

    }

}