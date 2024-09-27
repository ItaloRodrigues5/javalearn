public class Visitante{
    private String nome;
    private int idade;
    
    public Visitante(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public String toString(){
        return "Nome do Visitante: " + this.nome + "\nIdade: " + this.idade;
    }
}