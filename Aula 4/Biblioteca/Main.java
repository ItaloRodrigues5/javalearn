import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        /*

        Crie uma classe Biblioteca que possue nome e Livro.
        Livro é uma classe com isbn (código), título e Autor.
        Autor é uma classe com nome e sobrenome.

        Crie construtores, gets e sets,
        toStrings para esse projeto em Java e demonstre a
        comunicação entre esses objetos no main.

         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o código ISBN: ");
        String isbn = scanner.nextLine();

        System.out.print("Digite o nome do autor: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o sobrenome do autor: ");
        String sobrenome = scanner.nextLine();

        scanner.close();

        System.out.println();

        int vetor[] = new int[2];
        Autor autor[] = new String[];

    }
}
