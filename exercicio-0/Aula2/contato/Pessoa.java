public class Pessoa {
    String nome;
    int cpf;
    Contato contato;

    public void exibirDetalhes(){
        System.out.println("Nome do indivíduo: " + nome);
        System.out.println("CPF do indivíduo: " + cpf);
    }

    public int retornaCpf(){
        return cpf;
    }

    public void recebeCpf(int valor){
        cpf = valor;
    }

}
