package com.company;

import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produto> carrinho = new ArrayList<>();
    private double total;

    public void recebeProduto(Loja loja, Produto produto){
        if (loja.buscaProduto(produto).disponibilidade()){
            produto.retiraProduto();
            carrinho.add(produto);
        }
    }

    public void retiraProduto(Loja loja, Produto produto){
        if(loja.getProdutos().isEmpty()){
            System.out.println("Lista vazia");
        }else if(loja.buscaProduto(produto).equals(produto)){
            produto.adicionaProduto();
        }
    }

    public void calculaTotal(){
        for (Produto p: carrinho) {
            this.total += p.getPreco();
        }
    }


}
