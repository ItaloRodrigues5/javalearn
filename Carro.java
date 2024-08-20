public class Carro {
  String marca;
  String modelo;
  int ano;
  double preco;
  String cor;

  public Carro(String marca, String modelo, int ano, double preco, String cor){
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.preco = preco;
    this.cor = cor;
    
  }

  public void exibirDetalhes(){
    System.out.println("\nMarca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Ano: " + ano);
    System.out.println("Preço: " + preco);
    System.out.println("Cor: " + cor);
  }
  
  public void exibirDesconto(int desconto){
    double descontoFinal = preco * (desconto / 100.0);
    
    String descontoarredondado = String.format("%.2f", descontoFinal);
    double descontopuro = Double.parseDouble(descontoarredondado);
    
    System.out.println("\nValor de desconto em porcentagem: " + descontopuro);
    System.out.println("Valor com o desconto: " + (preco - descontopuro));
  }
}
