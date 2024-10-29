import java.util.ArrayList;

public interface Zord {
    ArrayList<Zord> zords = new ArrayList<>();

    public void ataque(){
        System.out.println(zords + "Atacar!!!");
    }
}
