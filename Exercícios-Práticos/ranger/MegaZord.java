import java.util.ArrayList;

public class MegaZord {
    ArrayList<Zord> zords;

    public MegaZord(){
        this.zords = new ArrayList<>();
    }

    public void adicionarZord(Zord zord){
        zords.add(zord);
    }

    public Ranger getPilotoRanger(PilotoRanger piloto){
        return piloto.getRanger();
    }
    
    public void listarZords(){
        for (Zord zord : zords) {
            System.out.println("Nome do piloto: " + zord);
        }
    }

    // public void listarZords(){
    //     for(int i=0; i < zords.size(); i++){

    //         Zord zord = zords.get(i);
    //         System.out.println("Nome do Zord fundido: " + zord.getRanger().getNome());
    //     }
    // }
    
    public void atacar(){
        System.out.println("Atacar!!!");
    }

    

}
