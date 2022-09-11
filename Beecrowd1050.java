import java.util.ArrayList;
import java.util.Scanner;

public class Beecrowd1050 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ddd = input.nextInt();
        String destination = "";

        ArrayList<Cadastro> listaCadastros = new ArrayList<Cadastro>();
        listaCadastros.add(new Cadastro(61, "Brasilia"));
        listaCadastros.add(new Cadastro(71, "Salvador"));
        listaCadastros.add(new Cadastro(11, "Sao Paulo"));
        listaCadastros.add(new Cadastro(21, "Rio de Janeiro"));
        listaCadastros.add(new Cadastro(32, "Juiz de Fora"));
        listaCadastros.add(new Cadastro(19, "Campinas"));
        listaCadastros.add(new Cadastro(27, "Vitoria"));
        listaCadastros.add(new Cadastro(31, "Belo Horizonte"));

        /*for(int i = 0; i < listaCadastros.size(); i++){
            if(listaCadastros.get(i).getDdd() == ddd){
                destination = listaCadastros.get(i).getDestination();
                System.out.println(destination);
                break;
            }
        }*/

        for(Cadastro cadastro : listaCadastros){
            if(cadastro.getDdd() == ddd) {
                destination = cadastro.getDestination();
                System.out.println(destination);
                break;
            }
        }

        if(destination == ""){
            System.out.println("DDD nao cadastrado");
        }

        input.close();

    }
}

class Cadastro {

    private int ddd;
    private String destination;

    Cadastro(int ddd, String destination){
        this.ddd = ddd;
        this.destination = destination;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

}
