import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Crie um programa em Java que represente um Sistema de Login.
        Deve possuir uma classe Login (com usuario e senha) e Pessoa (com nome e Login).
        Crie métodos para Login de validação de usuário e senha.
        No main, crie uma estrutura de repetição para verificar a "entrada" de uma "pessoa" a um sistema.
        Uma vez que a "pessoa" consiga entrar, ofereça opções nesse sistema (use a criatividade, mas não exagere).

        Lembre de possibilitar que a "pessoa" possa sair do "sistema" e encerre o programa.
        Lembre de criar as instâncias, usar While ou Do...While e Switch. Bem como chamar os métodos das classes :)

        Simbora!
         */
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();
        pessoa1.criarLogin();

        System.out.println("Digite seu nome de usuário: ");
        String username = scanner.nextLine();

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua senha: ");
        String senha = scanner.nextLine();

        pessoa1.login.podeAcessarUser(scanner.nextLine());
        pessoa1.login.podeAcessarSenha(scanner.nextLine());

        pessoa1.nome = nome;

        int op;

        do {
            System.out.println("Digite senha e nome de usuario: ");

            if (pessoa1.login.validaUsuario(scanner.nextLine(), scanner.nextLine())){
                System.out.println("Usuario logado");
            }
            else{
                System.out.println("Dados incorretos, tente de novo ou digite 1 para tentar de novo ou 2 para sair.");
            }
            System.out.println("Deseja sair?");
            op = Integer.parseInt(scanner.nextLine());
        }
        while(op != 2);

    }
}
