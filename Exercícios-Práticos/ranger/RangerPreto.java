public class RangerPreto extends Ranger{
    private String armadura;
    private String arma;

    public RangerPreto(String nome, String armadura, String arma){
        super(nome);
        this.armadura = armadura;
        this.arma = arma;
    }

    public void setArmadura(String armadura){
        this.armadura = armadura;
    }

    public String getArmadura(){
        return armadura;
    }

    public void setArma(String arma){
        this.arma = arma;
    }

    public String getArma(){
        return arma;
    }

    public void Morfar(String arma, String armadura){
        System.out.println("Nome: " + nome + "\nArma: " + arma + "\nArmadura: " + armadura);
    }
    
}
