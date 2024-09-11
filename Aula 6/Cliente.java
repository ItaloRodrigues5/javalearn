package com.company;

public class Cliente {

    private int cpf;
    private Carrinho carrinho;

    public Cliente(int cpf) {
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void criaCarrinho() {
        this.carrinho = new Carrinho();
    }

    public void escolheProduto(Loja loja, Produto produto){
        carrinho.recebeProduto(loja,produto);
    }

    public void retiraProduto(Loja loja, Produto produto){
        carrinho.retiraProduto(loja,produto);
    }

}
