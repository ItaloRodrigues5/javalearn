//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char op;
        int a = 10;
        int b = 20;
        int escolha;

        do{
            System.out.println("Escolha uma opção: ");
            op = scanner.next().charAt(0);

            switch(op){
                case '+': System.out.println(a+b);
                break;
                case '-': System.out.println(a-b);
                break;
                case '*': System.out.println(a*b);
                break;
                case '/': System.out.println(a/b);
                break;
                default:
                    System.out.println("Valor não conhecido");
            }
            System.out.println("Deseja sair? Digite 1.");
            escolha = scanner.nextInt();
        }
        while(escolha != 1);

    }
}
