public class Personagem {
    private String nome;
    private Kart kart;

    public Personagem(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Kart getKart() {
        return kart;
    }

    public void setKart(Kart kart){
        this.kart = kart;
    }
    public void acelera(int velocidade){
        this.kart.corre(velocidade);
    }
}
