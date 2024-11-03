public class Zords implements Zord{
    private NomeZord nomezord;
    protected PilotoRanger piloto;

    public Zords(PilotoRanger piloto){
        this.piloto = piloto;
        this.nomezord = NomeZord.SEMZORD;
    }

    public String getPilotoRanger(){
        return piloto.getRanger().getNome();
    }

    public void setNomeZord(NomeZord nomezord){
        this.nomezord = nomezord;
    }

    public NomeZord getNomeZord(){
        return nomezord;
    }

    public void pilotar(){
        System.out.println("Piloto " + getPilotoRanger() + " do Zord " + getNomeZord() + " pilotando...");
    }

    public void atirar(){
        System.out.println("Piloto " + getPilotoRanger() + " do Zord " + getNomeZord() + " atirando...");
    }

    public void voar(){
        System.out.println("Piloto " + getPilotoRanger() + " do Zord " + getNomeZord() + " voando...");
    }

    public void correr(){
        System.out.println("Piloto " + getPilotoRanger() + " do Zord " + getNomeZord() + " correndo...");
    }

}
