import java.util.ArrayList;

public class Loja {
    ArrayList<Produto> produto = new ArrayList<>();
    String nome;

    public Loja(String nome){
        this.nome = nome;
    }

    public void adicionaProduto(Produto produto){
        this.produto.add(produto);
    }

    public void removeProduto(Produto produto){
        this.produto.remove(produto);
    }

    public boolean buscaProduto(){
        if(this.produto.contains(produto)){
            return true;
        }
        else{
            return false;
        }
    }
}
