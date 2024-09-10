public class Produto {
    private int id;
    private Estoque estoque;
    private String descricao;
    private double preco;

    public Produto(int id, Estoque estoque, String descricao, double preco){
        this.id = id;
        this.estoque = new Estoque();
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getId(){
        return id;
    }

    public Estoque getEstoque(){
        return estoque;
    }

    public String getDescricao(){
        return descricao;
    }

    public double getPreco(){
        return preco;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setEstoque(Estoque estoque){
        this.estoque = estoque;
    }

    public void setdescricao(String descricao){
        this.descricao = descricao;
    }

    public void setPreco(){
        this.preco = preco;
    }

    public boolean disponibilidade(){
        if (estoque.getQuantidade() < 1){
            return false;
        }
        else{
            return true;
        }
    }


}
