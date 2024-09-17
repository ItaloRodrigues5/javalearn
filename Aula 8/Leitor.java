public class Leitor extends Pessoa{
    private String socio;
    
    public Leitor(String nome, String socio){
        super(nome);
        this.socio = socio;
    }
    
    public String retornaSocio(){
        return socio;
    }
    
    public void declaraSocio(String socio){
        this.socio = socio;
    }
}
