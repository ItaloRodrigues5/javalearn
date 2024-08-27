public class Kart {
    private String cor;
    private int velocidade;
    private Personagem personagem;
    private String direcao;

    public Kart(String cor, int velocidade) {
        this.cor = cor;
        this.velocidade = velocidade;
    }

    public String getDirecao(){
        return direcao;
    }


    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public int getVelocidade(){
        return velocidade;
    }
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }

    public Personagem getPersonagem(){
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public void corre(int km){
        this.velocidade += km;
        System.out.println("O carro está a " + this.velocidade + "km");
    }

    public void mudarDirecao(String direcaoatual, String direcaonova){

    }
}

