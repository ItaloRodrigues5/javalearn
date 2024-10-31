public class TigreZordBranco implements Zord{
    private PilotoRanger pilotoranger;

    public void pilotar(){
        System.out.println(pilotoranger.getRanger().getNome() + " pilotando...");
    }

    public void atirar(){
        System.out.println(pilotoranger.getRanger().getNome() + " atirando...");
    }

    public void voar(){
        System.out.println(pilotoranger.getRanger().getNome() + " voando...");
    }

    public void correr(){
        System.out.println(pilotoranger.getRanger().getNome() + " correndo...");
    }
    
}
