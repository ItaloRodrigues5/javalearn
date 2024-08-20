public class Pessoa{
  String nome;
  int idade;
  
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