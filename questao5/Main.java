import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informações do veículo");
    
    System.out.print("\nInsira a marca do carro: ");
    String marca = scanner.nextLine();

    System.out.print("Insira o modelo do carro: ");
    String modelo = scanner.nextLine();

    System.out.print("Insira o ano do carro: ");
    int ano = scanner.nextInt();

    System.out.print("Insira o valor do carro: ");
    double preco = scanner.nextDouble();

    String valorarredondado = String.format("%.2f", preco);
    double valorpuro = Double.parseDouble(valorarredondado);

    scanner.nextLine();

    System.out.print("Insira a cor do carro: ");
    String cor = scanner.nextLine();

    System.out.println("\nInformações do comprador");

    System.out.print("\nInsira seu nome: ");
    String nome = scanner.nextLine();

    System.out.print("Insira sua idade: ");
    int idade = scanner.nextInt();
    
    scanner.close();

    //Isso aqui seria o "ponteiro" feito dentro do Main
    
    /*
    Carro carro1 = new Carro();
    carro1.marca = marca;
    carro1.modelo = modelo;
    carro1.ano = ano;
    carro1.preco = preco;
    carro1.cor = cor;

    Pessoa pessoa1 = new Pessoa();
    pessoa1.nome = nome;
    pessoa1.idade = idade;
    */

    //Isso aqui é a síntese do "ponteiro", onde basta só indicar o nome da váriável declarando as variáveis aos objetos das classes Carro e Pessoa
    
    Carro carro1 = new Carro(marca, modelo, ano, preco, cor);

    Pessoa pessoa1 = new Pessoa(nome, idade);
    
    //Carro carro1 = new Carro("Toyota", "Corolla", 2024, 99.99, "amarelo");

    //Pessoa pessoa1 = new Pessoa("João", 25);

    System.out.println("\nResultados");
    
    carro1.exibirDetalhes();

    carro1.exibirDesconto(12);
    
    pessoa1.exibirInformacoes();

    pessoa1.alteraIdade(5);

  }
}
