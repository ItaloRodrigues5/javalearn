public class Aluno {
    private int matricula;
    private String nome;
    private Status status;
    private static int cont;
    private int nota1;
    private int nota2;

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.status = Status.MATRICULADO;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public static int quantidade(){
        return cont;
    }

    public int somaNotas(int a, int b){
        this.nota1 = a;
        this.nota2 = b;

        return a + b + 1;
    }
}
