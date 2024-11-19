public class Universidade {
    private String nome;
    private Curso curso;
    private Aluno aluno;

    public Universidade(String nome, Curso curso, Aluno aluno) {
        this.nome = nome;
        this.curso = curso;
        this.aluno = aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
