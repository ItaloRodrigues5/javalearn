public class Pessoa {
    String nome;
    int idade;
    Endereco endereco;


    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Rua: " + endereco.rua + " Bairro: " + endereco.bairro);
    }
}
