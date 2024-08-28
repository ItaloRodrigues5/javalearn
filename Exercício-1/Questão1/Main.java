import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int numero2 = scanner.nextInt();

        //System.out.println("A soma do número " + numero1 + " e " + numero2 + " = " + soma);

        System.out.println("===\nDigite 1 para Somar os números===\n" +
                "===Digite 2 para subtrarir o primeiro número pelo segundo===\n" +
                "===Digite 3 para multiplicar o segundo código===\n" +
                "===Digite 4 para dividir===");

        int op = scanner.nextInt();

        switch(op){
            case 1:
                int soma = numero1 + numero2;
                System.out.println("A soma dos números " + numero1 + " e " + numero2 + " = " + soma);
                break;
            case 2:
                int subtracao = numero1 - numero2;
                System.out.println("A subtração dos números " + numero1 + " e " + numero2 + " = " + subtracao);
                break;
            case 3:
                int multiplicacao = numero1 * numero2;
                System.out.println("A multiplicação dos números " + numero1 + " e " + numero2 + " = " + multiplicacao);
                break;
            case 4:

                while(numero1 == 0) {
                    System.out.println("Olha usuário. O divisor é 0. Logo é impossível dividir quaisquer números.");
                    System.out.println("Digite um valor apropriado para a divisão");

                    numero1 = scanner.nextInt();
                }

                double divisao = numero2 / numero1;
                System.out.println("A divisão dos números " + numero1 + " e " + numero2 + " = " + divisao);
                break;
        }
    }
}
