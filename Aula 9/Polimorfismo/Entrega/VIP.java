public class VIP implements Fidelidade{
    public int pontos;

    @Override
    public void calculaPontos(int pontos) {
        this.pontos += pontos;
    }
}
