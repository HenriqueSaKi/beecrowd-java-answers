import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Beecrowd1257 {

    private static int calculaHash (String linha, int elementoDeEntrada) {
        
        int soma = 0;

        for (int i = 0; i < linha.length(); i++) {

            Letra letra = new Letra(linha.charAt(i), elementoDeEntrada, i);
            soma = soma + letra.getCalculoHash(linha.charAt(i));

        }

        return soma;

    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int casosTeste = input.nextInt();

        List<Integer> valores = new ArrayList<Integer>();

        for (int i = 0; i < casosTeste; i++) {

            int soma = 0;

            int qtdeLinhas = input.nextInt();
            for(int j = 0; j < qtdeLinhas; j++) {

                String linha = input.next();
                soma = soma + calculaHash(linha, j);

            }

            valores.add(soma);
            
        }

        for (int valor : valores) {
            System.out.println(valor);
        }

        input.close();
    
    }
    
}

class Letra {

    int posicaoNoAlfabeto;
    int elementoDeEntrada;
    int posicaoDoElemento;

    Letra(int posicaoNoAlfabeto, int elementoDeEntrada, int posicaoDoElemento) {
        this.posicaoNoAlfabeto = posicaoNoAlfabeto;
        this.elementoDeEntrada = elementoDeEntrada;
        this.posicaoDoElemento = posicaoDoElemento;
    }

    public int getPosicaoNoAlfabeto(Character letra) {
        
        List<String> alfabeto = new ArrayList<>();
        alfabeto.add("A"); // Posicao: 0
        alfabeto.add("B"); // Posicao: 1
        alfabeto.add("C"); // Posicao: 2
        alfabeto.add("D"); // Posicao: 3
        alfabeto.add("E"); // Posicao: 4
        alfabeto.add("F"); // Posicao: 5
        alfabeto.add("G"); // Posicao: 6
        alfabeto.add("H"); // Posicao: 7
        alfabeto.add("I"); // Posicao: 8
        alfabeto.add("J"); // Posicao: 9
        alfabeto.add("K"); // Posicao: 10
        alfabeto.add("L"); // Posicao: 11
        alfabeto.add("M"); // Posicao: 12
        alfabeto.add("N"); // Posicao: 13
        alfabeto.add("O"); // Posicao: 14
        alfabeto.add("P"); // Posicao: 15
        alfabeto.add("Q"); // Posicao: 16
        alfabeto.add("R"); // Posicao: 17
        alfabeto.add("S"); // Posicao: 18
        alfabeto.add("T"); // Posicao: 19
        alfabeto.add("U"); // Posicao: 20
        alfabeto.add("V"); // Posicao: 21
        alfabeto.add("W"); // Posicao: 22
        alfabeto.add("X"); // Posicao: 23
        alfabeto.add("Y"); // Posicao: 24
        alfabeto.add("Z"); // Posicao: 25

        return alfabeto.indexOf(letra.toString());
    }

    public void setPosicaoNoAlfabeto(int posicaoNoAlfabeto) {
        this.posicaoNoAlfabeto = posicaoNoAlfabeto;
    }

    public int getElementoDeEntrada() {
        return elementoDeEntrada;
    }

    public void setElementoDeEntrada(int elementoDeEntrada) {
        this.elementoDeEntrada = elementoDeEntrada;
    }

    public int getPosicaoDoElemento() {
        return posicaoDoElemento;
    }

    public void setPosicaoDoElemento(int posicaoDoElemento) {
        this.posicaoDoElemento = posicaoDoElemento;
    }

    public int getCalculoHash (Character letra) {
        return getPosicaoNoAlfabeto(letra) + elementoDeEntrada + posicaoDoElemento;
    }

}
