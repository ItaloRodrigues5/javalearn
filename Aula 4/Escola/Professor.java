public class Professor {
    private String nome;
    private Disciplina disciplina;

    public Professor(String nome, Disciplina disciplina) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
