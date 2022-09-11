import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Beecrowd1168 {

    private static int numeroLed (String valor) {

        int qtdeTotalLeds = 0;
        String[] listaNumeros = valor.split("");

        List<DisplayNumerico> visor = new ArrayList<DisplayNumerico>();
        visor.add(new DisplayNumerico("1", 2));
        visor.add(new DisplayNumerico("2", 5));
        visor.add(new DisplayNumerico("3", 5));
        visor.add(new DisplayNumerico("4", 4));
        visor.add(new DisplayNumerico("5", 5));
        visor.add(new DisplayNumerico("6", 6));
        visor.add(new DisplayNumerico("7", 3));
        visor.add(new DisplayNumerico("8", 7));
        visor.add(new DisplayNumerico("9", 6));
        visor.add(new DisplayNumerico("0", 6));

        for(String numero : listaNumeros){
            for(int i = 0; i < visor.size(); i++){
                if (visor.get(i).getNumero().equalsIgnoreCase(numero)) {
                    qtdeTotalLeds += visor.get(i).getQuantidadeLed();
                }
            }            
        }

        return qtdeTotalLeds;

    }
 
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int casosTeste = input.nextInt();

        List<String> listaValores = new ArrayList<String>();

        for(int i = 0; i < casosTeste; i++){
            listaValores.add(input.next());
        }

        for(String numero : listaValores){
            int qtdeTotalLeds = 0;
            qtdeTotalLeds = numeroLed(numero);
            System.out.println(qtdeTotalLeds + " leds");
        }
        
        input.close();
 
    }
 
}

class DisplayNumerico {

    String numero;
    int quantidadeLed;

    DisplayNumerico (String numero, int quantidadeLed) {
        this.numero = numero;
        this.quantidadeLed = quantidadeLed;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getQuantidadeLed() {
        return quantidadeLed;
    }

    public void setQuantidadeLed(int quantidadeLed) {
        this.quantidadeLed = quantidadeLed;
    }

}