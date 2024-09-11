package com.company;

public class Main {

    public static void main(String[] args) {
    // write your code here
        Produto p1 = new Produto(1, "Pipos",3,2);
        Produto p2 = new Produto(2, "Guaraná",5,2);
        Loja l1 = new Loja("Super");
        l1.adicionaProduto(p1);
        l1.adicionaProduto(p2);
        Cliente c1 = new Cliente(123);
        c1.criaCarrinho();
        c1.escolheProduto(l1,p1);
        System.out.println(p1);
        c1.retiraProduto(l1,p1);
        System.out.println(p1);


    }
}
