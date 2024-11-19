abstract public class Ranger {
    protected String nome;

    public Ranger(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    // public void Morfar(){
    //     System.out.println("Vazio");
    // }

    abstract public void Morfar();

    public void MorfarArmadura(){
        System.out.println("Armadura ativada");
    }

    public void MorfarArmaArmadura(){
        System.out.println("Arma e armadura ativadas");
    }

}

