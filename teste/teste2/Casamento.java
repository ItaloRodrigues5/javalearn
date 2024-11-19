public class Casamento extends Evento {

    public Casamento() {
        tipoEvento = TipoEvento.CASAMENTO;
    }

    @Override
    public void realizarEvento() {
        System.out.println("Realizando evento de Casamento.");
    }
}
