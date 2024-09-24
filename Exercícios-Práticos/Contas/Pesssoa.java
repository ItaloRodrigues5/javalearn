public class Pessoa{
    private String nome;
    private Conta conta;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setConta(Conta conta){
        this.conta = conta;
    }
    
    public Conta getConta(){
        return conta;
    }
    
    public String toString(){
        return "Nome: " + this.nome + "\nConta: " + getConta().getNumero() + "\nSaldo: " + conta.getSaldo();
    }
}
