package com.company;

import java.util.ArrayList;

public class Loja {

    private ArrayList<Produto> produtos = new ArrayList<>();
    private String nome;

    public Loja(String nome) {
        this.nome = nome;
    }

    public Produto buscaProduto(Produto produto) {
        if (produtos.contains(produto)){
            System.out.println("Produto encontrado");
            System.out.println(produto);
            return produto;
        }else{
            return null;
        }
    }

    public void removeProduto(Produto produto){
        this.produtos.remove(produto);
    }

    public void adicionaProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}
