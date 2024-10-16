public abstract class Entregador {

    protected double saldo;
    private Fidelidade fidelidade;

    public void entregaPedido(Pedido p){
        System.out.println("Entregador chegando de moto, fique no aguardo.");
    }

    public abstract void gorjeta(double valor);

    public void calculaFidelidade(Fidelidade f, int pontos){
        fidelidade = f;
        f.calculaPontos(pontos);
    }
}
