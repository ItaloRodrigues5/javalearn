//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Endereco end1 = new Endereco();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        pessoa1.nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        pessoa1.idade = scanner.nextInt();

        //Caso não queira usar o scanner.nextLine(); use isso abaixo, logo acima:
        //pessoa1.idade = Integer.parseInt(scanner.nextLine());

        scanner.nextLine();

        System.out.println("Digite a sua rua: ");
        end1.rua = scanner.nextLine();

        System.out.println("Digite seu bairro: ");
        end1.bairro = scanner.nextLine();

        scanner.close();

        /*
        end1.rua = "rua do seila";
        end1.bairro = "bairro do seila";

        pessoa1.nome = "xuxa";
        pessoa1.idade = 25;
        */
        pessoa1.endereco = end1;

        pessoa1.exibirDados();
        end1.exibirEnd();

    }
}
