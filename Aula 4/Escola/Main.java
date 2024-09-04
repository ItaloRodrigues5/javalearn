import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
    Crie um projeto em java que represente uma matrícula de
    Aluno, com Disciplina, Professor e Notas.

    Disciplina receberá como agregação Aluno e Professor
    e Aluno será composto por Notas
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite");
        Disciplina disc1 = new Disciplina();
        Notas nota[] = new Notas[];
        Aluno aluno1 = new Aluno(123, "xuxa mirin");
        Professor professor1 = new Professor("xuxa", disc1);
        

        System.out.println("Dados do Professor\n");

        System.out.println("Digite o nome do professor: ");
        professor1.setNome(scanner.nextLine());

        System.out.println("Dados da Disciplina\n");

        System.out.println("Digite o nome da disciplina: ");
        disc1.setNome(scanner.nextLine());
        
        System.out.println("Dados do aluno\n");
        
        System.out.println("Digite a matrícula do aluno: ");
        aluno1.setMatricula(scanner.nextInt());
        
        System.out.println("Digite o nome do aluno: ");
        aluno1.setNome(scanner.nextLine());
        
        scanner.close();
        
        
        
    }
}
