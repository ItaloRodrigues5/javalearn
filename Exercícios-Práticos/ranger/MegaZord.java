import java.util.ArrayList;

public class MegaZord {
    ArrayList<Zord> zords = new ArrayList<>();

    public void atacar(){
        System.out.println("Atacar!!!");
    }

    

    public void listarZords(){
        for(int i=0; i < zords.size(); i++){
            System.out.println("Nome do Zord: " + zords.get(i));
        }
    }
}
