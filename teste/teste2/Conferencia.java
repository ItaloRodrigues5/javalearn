public class Conferencia extends Evento {

    public Conferencia() {
        tipoEvento = TipoEvento.CONFERENCIA;
    }

    @Override
    public void realizarEvento() {
        System.out.println("Realizando evento de Conferência.");
    }
}