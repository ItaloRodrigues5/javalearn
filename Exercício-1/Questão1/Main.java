import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma do número " + numero1 + " e " + numero2 + " = " + soma);

        System.out.println("Digite 1 para Multiplicar os números\nDigite 2 para Dividir o primeiro número pelo segundo\nDigite 3 para subtrair o segundo código");

    }
}
