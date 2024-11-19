import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Organizavel> eventos = new ArrayList<>();

        Evento casamento = new Casamento();
        Evento conferencia = new Conferencia();

        eventos.add(casamento);
        eventos.add(conferencia);

        try {
            for (Organizavel evento : eventos) {
                evento.organizarEvento();
                if (evento instanceof Evento) {
                    Evento e = (Evento) evento;
                    e.realizarEvento();

                    double custo = e.calcularCustoEvento(150, 5, true);
                    System.out.println("Custo total do evento: R$ " + custo);

                    e.adicionarParticipante(100);
                }
            }
            System.out.println("Total de participantes em todos os eventos: " + Evento.totalParticipantes);

        } catch (LimiteDeCapacidadeExcedidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
