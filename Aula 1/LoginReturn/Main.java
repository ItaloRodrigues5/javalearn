import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();
        Login pessoa2 = new Login("Maria", "eula123456");
        pessoa1.criarLogin();

        System.out.println("Cadastro de Usuário\n");

        System.out.print("Digite seu nome: ");
        pessoa1.nome = scanner.nextLine();

        System.out.print("Digite seu nome de usuário: ");
        pessoa1.login.podeAcessarUser(scanner.nextLine());

        System.out.print("Digite sua senha de cadastro: ");
        pessoa1.login.podeAcessarPass(scanner.nextLine());


    /*
    Poderia ter feito assim tbm para compreender e separar melhor as coisas:

    System.out.print("Digite seu nome: ");
    String nome = scanner.nextLine();

    System.out.print("Digite seu nome de usuário: ");
    String usuario = scanner.nextLine();

    System.out.print("Digite sua senha de cadastro: ");
    String senha = scanner.nextLine();

    pessoa1.nome = nome;
    pessoa1.login.podeAcessarUser(usuario);
    pessoa1.login.podeAcessarPass(senha);
    */

        int op;

        do{
            System.out.println("\nLogin de Usuário\n");

            System.out.print("Digite seu nome de usuário: ");
            String user = scanner.nextLine();

            System.out.print("Digite sua senha: ");
            String password = scanner.nextLine();

            if (pessoa1.login.validaLogin(user, password)){
                System.out.println("\nUsuário Logado com sucesso!");
            }
            else{
                System.out.println("\nUsuário ou senha inválidos!");
            }

            System.out.println("\nDeseja sair? Digite 1 (um)");
            op = Integer.parseInt(scanner.nextLine());

        }

        while(op != 1);

        // Imprime o retono de toString que traz os valores inseridos em Login.
        // Só mostra por esse method

        System.out.println(pessoa1.login.toString());

        System.out.println("\nDeseja alterar senha?\n");

        System.out.print("Digite a nova senha: ");
        String newSenha = scanner.nextLine();

        scanner.close();

        pessoa1.login.alteraSenha(newSenha);

        System.out.println("\nAbaixo é o toString\n");

        System.out.println(pessoa1.login.toString() + "\n");

        System.out.println("Abaixo é do getUsuario\n");

        System.out.println(pessoa1.login.getUsuario() + "\n");

        System.out.println(pessoa2.toString());

    }
}
