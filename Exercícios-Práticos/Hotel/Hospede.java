public class Hospede {
    private String nome;
    private int pontosFidelidade;
    private Reserva reserva;

    public Hospede(String nome, int pontosFidelidade) {
        this.nome = nome;
        this.pontosFidelidade = pontosFidelidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontosFidelidade() {
        return pontosFidelidade;
    }

    public void setPontosFidelidade(int pontosFidelidade) {
        this.pontosFidelidade = pontosFidelidade;
    }

    public void aplicaFidelidade(Reserva quantidadeDias){
        double totaldepontos = this.pontosFidelidade * quantidadeDias.getQuantidadeDias();

        System.out.println("O total de pontos que tem é: " + totaldepontos);
    }

    public String toString(){
        return "Nome: " + this.nome;
    }
}
