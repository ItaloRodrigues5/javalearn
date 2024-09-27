public class Atracao{
    private String nome;
    
    public Atracao(String nome){
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String toString(){
        return "Nome da atração: " + this.nome;
    }
    
}