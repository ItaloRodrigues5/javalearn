package com.company;

public class Produto {

    private int id;
    private double preco;
    private String descricao;
    private Estoque estoque;

    public Produto(int id, String descricao, double preco, int quantidade) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = new Estoque(quantidade);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public boolean disponibilidade(){
        if(estoque.getQuantidade() < 1){
            return false;
        }else{
            return true;
        }
    }

    public void retiraProduto(){
        estoque.retiraQuantidade();
    }

    public void adicionaProduto(){
        estoque.adicionaQuantidade();
    }


    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", preco=" + preco +
                ", estoque=" + estoque.getQuantidade() +
                '}';
    }
}
