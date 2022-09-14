import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beecrowd1197 {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha;

        while ((linha = br.readLine()) != null) {
            
            String[] valores = linha.split(" ");
            int v = Integer.parseInt(valores[0]);
            int t = Integer.parseInt(valores[1]);

            int resposta = 0;

            resposta = deslocamentoDobroDoTempo(v, t);

            System.out.println(resposta);
            
        }
        
    }

    private static int deslocamentoDobroDoTempo (int v, int t) {
        return v * t * 2;
    }
    
}
