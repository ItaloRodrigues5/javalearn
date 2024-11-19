public abstract class Evento implements Organizavel {
    protected static int totalParticipantes = 0;
    protected TipoEvento tipoEvento;

    public abstract void realizarEvento();

    public double calcularCustoEvento(int numeroParticipantes, int duracaoHoras, boolean servicosAdicionais) {
        double custoBase = 1000;
        double custoPorParticipante = 50;
        double custoDuracao = duracaoHoras * 100;
        double custoServicos = servicosAdicionais ? 500 : 0;

        double custoTotal = custoBase + (numeroParticipantes * custoPorParticipante) + custoDuracao + custoServicos;

        if (tipoEvento == TipoEvento.CASAMENTO) {
            custoTotal += 200;
        } else if (tipoEvento == TipoEvento.CONFERENCIA) {
            custoTotal *= 1.1;
        }

        return custoTotal;
    }

    public void adicionarParticipante(int participantes) throws LimiteDeCapacidadeExcedidoException {
        int novaQuantidade = totalParticipantes + participantes;
        if (novaQuantidade > 1000) { // Suponhamos que o limite de capacidade seja 1000
            throw new LimiteDeCapacidadeExcedidoException("Limite de capacidade excedido para o evento.");
        }
        totalParticipantes += participantes;
    }

    // Método para organizar o evento
    @Override
    public void organizarEvento() {
        System.out.println("Organizando evento do tipo: " + tipoEvento);
    }
}
