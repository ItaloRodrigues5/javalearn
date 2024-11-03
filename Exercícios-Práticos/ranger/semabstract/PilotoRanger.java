public class PilotoRanger {
    protected Ranger ranger;

    public PilotoRanger(Ranger ranger){
        this.ranger = ranger;
    }

    //Retornando o atributo por meio da Classe
    public Ranger getRanger(){
        return ranger;
    }

    //Retornando o atributo diretamente
    // public String getRanger(){
    //     return ranger.getNome();
    // }

    public void setPiloto(Ranger nome){
        this.ranger = nome;
    }

    public String toString(){
        return "\nNome do piloto do MegaZord: " + ranger.getNome();
    }
}
