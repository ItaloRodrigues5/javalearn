public class RangerVermelho extends Ranger{
    private String armadura;
    private String arma;

    public RangerVermelho(String nome, String armadura, String arma){
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

    @Override
    public void Morfar(){
        System.out.println("Nome: " + nome + "\nArma: " + arma + "\nArmadura: " + armadura);
    }
}
