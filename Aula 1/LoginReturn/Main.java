import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    
    Pessoa pessoa1 = new Pessoa();
    pessoa1.criarLogin();

    System.out.println("Cadastro de Usuário\n");

    System.out.print("Digite seu nome: ");
    pessoa1.nome = scanner.nextLine();

    System.out.print("Digite seu nome de usuário: ");
    pessoa1.login.podeAcessarUser(scanner.nextLine());

    System.out.print("Digite sua senha de cadastro: ");
    pessoa1.login.podeAcessarPass(scanner.nextLine());

    int op;

    do{
      System.out.println("\nLogin de Usuário\n");

      System.out.print("Digite seu nome de usuário: ");
      String user = scanner.nextLine();
      
      System.out.print("Digite sua senha: ");
      String password = scanner.nextLine();

      pessoa1.login.validaLogin(user, password);

      System.out.println("\nDeseja sair? Digite 1 (um)");
      op = Integer.parseInt(scanner.nextLine());
    
    }
    
      while(op != 1);
    
    scanner.close();
    
  }
}
