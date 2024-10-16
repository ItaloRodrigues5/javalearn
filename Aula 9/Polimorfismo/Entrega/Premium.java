public class Premium implements Fidelidade{

    public int pontos;

    @Override
    public void calculaPontos(int pontos) {
        this.pontos += pontos + (pontos * 0.1);
    }

    public String toString(){
        return pontos;
    }
}
