import java.util.ArrayList;

public class MegaZord {
    private ArrayList<Zords> zords;

    public MegaZord(){
        this.zords = new ArrayList<>();
    }

    public void adicionarZord(Zords zord){
        zords.add(zord);
    }
    
    // public void listarZords(){
    //     for (Zord zord : zords) {
    //         System.out.println("Nome do piloto: " + zord.getPiloto());
    //     }
    // }

    public void listarZords(){
        for(int i=0; i < zords.size(); i++){
            System.out.println("Nome do Zord fundido: " + zords.get(i).getNomeZord());
            System.out.println("Piloto do Zord: " + zords.get(i).getPilotoRanger());
        }
    }
    
    public void atacar(){
        System.out.println("MegaZord, atacar!!! \n");
    }

    

}
