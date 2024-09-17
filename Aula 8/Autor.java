public class Autor extends Pessoa{
    private String generoliterario;
    
    public Autor(String nome, String generoliterario){
        super(nome);
        this.generoliterario = generoliterario;
    }
    
    public String retornaGenero(){
        return generoliterario;
    }
    
    public void declaraGenero(String generoliterario){
        this.generoliterario = generoliterario;
    }
}
