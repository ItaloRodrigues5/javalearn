public class Aluno{
    private int matricula;
    private String nome;
    private static int cont;

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        cont++;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int quantAluno(){
        return cont;
    }
}