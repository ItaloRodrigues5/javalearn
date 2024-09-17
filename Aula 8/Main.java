import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        Pessoa pessoa1 = new Pessoa();
        
        
        System.out.print("Digite seu nome");
        pessoa1.nome = scanner.nextLine();
    }
}
