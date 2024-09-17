public class Pessoa{
    private String nome;
    
    public Pessoa (String nome){
        this.nome = nome;
    }
    
    public String retornaNome(){
        return nome;
    }
    
    public void declaraNome(String nome){
        this.nome = nome;
    }
}
