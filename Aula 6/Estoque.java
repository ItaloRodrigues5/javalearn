public class Estoque {
    int quantidade;

    public Estoque(int quantidade){
        this.quantidade = quantidade;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public String toString(){
        return "Estoque: " + quantidade;
    }
}
