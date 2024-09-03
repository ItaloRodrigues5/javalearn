import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //int vetor[] = new int[2];
        //Pessoa pessoas[] = new Pessoa[];

        Scanner scanner = new Scanner(System.in);
        
        int tamanho = scanner.nextInt();
        Pessoa pessoa1 = new Pessoa("Xuxa");
        Conta contas[] = new Conta[tamanho];

        for(int i = 0; i < contas.length; i++){
            System.out.println("Insira o número da conta: " + (i + 1));
            //Conta conta1 = new Conta(scanner.nextInt());
            //contas[i] = conta1;
            contas[i] = new Conta(scanner.nextInt());
        }
        pessoa1.setConta(contas);
        
        for(int i = 0; i < contas.length; i++){
            System.out.println(pessoa1.getConta()[0].getNumero());    
        }
        
    }
}
