public class Pessoa{
  String nome;
  int idade;
  //Isso seria mais ou menos o "ponteiro" que indicará qual variável dentro da classe carro indica na classe Main quando é chamada
  public Pessoa (String nome, int idade){
    this.nome = nome;
    this.idade = idade;
    
  }

  public void exibirInformacoes(){
    System.out.println("\nNome: " + nome);
    System.out.println("Idade: " + idade);
    
  }
  public void alteraIdade(int anos){
    this.idade += anos;
    System.out.println("Atualmente com " + idade + " anos.");
  }
}