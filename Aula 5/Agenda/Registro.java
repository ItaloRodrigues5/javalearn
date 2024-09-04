import java.lang.reflect.Array;
import java.util.ArrayList;

public class Registro {

    ArrayList<Agenda> agenda = new ArrayList<>();

    public void getAgenda(){
        for(Agenda agenda: agenda){
            System.out.println(agenda);
        }
    }

    public void setAgenda(Agenda agenda){
        this.agenda.add(agenda);
    }
}
