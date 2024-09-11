package com.company;

public class Estoque {

    private int quantidade;

    public Estoque(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void retiraQuantidade(){
        quantidade -= 1;
    }

    public void adicionaQuantidade(){
        quantidade += 1;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
```
