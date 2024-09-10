public class Cliente {
    private int cpf;
    private String nome;
    private Carrinho carrinho;

    public Cliente(int cpf, String nome, Carrinho carrinho){
        this.cpf = cpf;
        this.nome = nome;
    }

    public void criaCarrinho(){
        this.carrinho = new Carrinho();
    }

    public int getCPF(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }

    public void setCPF(int cpf){
        this.cpf = cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
