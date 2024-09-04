import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Registro registro = new Registro();

        registro.getAgenda();

        int resposta = -1;

        while(resposta != 0){
            System.out.println("Deseja agendar algum contato?\n" +
                    "Digite 1 para sim, 0 para não");
            int reposta = Integer.parseInt(scanner.nextLine());

            if (reposta == 1){
                System.out.println("Digite seu nome e número de telefone");
                String nome = scanner.nextLine();
                String telefone = scanner.nextLine();

                Agenda agenda = new Agenda(nome, telefone);

                registro.setAgenda(agenda);
            }
            else{
                break;
            }
        }
        /*
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        for(Agenda agenda: lista){
            System.out.println(agenda);
        }*/
        scanner.close();
    }

}
