public class Main{
    public static void main(String[] args) {

        Aluno a1 = new Aluno(123, "Xuxa");
        Aluno a2 = new Aluno(124, "Pabilu");

        a2.setStatus(Status.PENDENDE);

        System.out.println(a1.getStatus());

        System.out.println(a1.quantidade());

        System.out.println(Aluno.quantidade());

        System.out.println(a1.getNome());

    }
}
