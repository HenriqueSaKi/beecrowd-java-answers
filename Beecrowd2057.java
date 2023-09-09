import java.util.Scanner;

public class Beecrowd2057 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int T = sc.nextInt();
        int F = sc.nextInt();

        int horaPrevista = S + T + F;
        System.out.println(horaPrevista >= 24 ? horaPrevista % 24 : 
            horaPrevista < 0 ? 24 + horaPrevista : horaPrevista);

    }
    
}
