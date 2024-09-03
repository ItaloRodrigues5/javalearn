public class Pessoa {
    String nome;
    String conta[];

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getConta() {
        return conta;
    }
    public void setConta(String[] conta) {
        this.conta = conta;
    }
}
