
import java.util.ArrayList;

public class CasadeEventos {

    public static void main(String[] args) {
        ArrayList<Organizavel> eventos = new ArrayList<>();

        Evento casamento = new Casamento();
        Evento aniversario = new Aniversario();
        Evento aniversario2 =  new Aniversario();
        Evento casamento2 = new Casamento();

        eventos.add(casamento);
        eventos.add(aniversario);
        eventos.add(casamento2);
        eventos.add(aniversario2);
        
        for (Organizavel evento : eventos) {
            evento.organizarEvento();
            
            if(evento instanceof Evento){
                Evento e =  (Evento) evento;
                e.realizarEvento();
                
                e.adicionaParticipante(100);

                String custo = e.calcularCustoEvento(150, 5, TipoEvento.CASAMENTO, 5);

                System.out.println("Custo total: " + custo);
    
            }
        }
        System.out.println(Evento.getTotalParticipantes());
        
        System.out.println(Evento.totalparticipantes);
    }

}
