//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{

    public static void main(String[] args){
        int num;

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "maria";

        Contato contato1 = new Contato();

        contato1.numero = 40028922;
        pessoa1.contato = contato1;

        pessoa1.exibirDetalhes();
        pessoa1.recebeCpf(1234);


        System.out.println(pessoa1.retornaCpf());
        System.out.println("Contato: " + pessoa1.contato.numero);


        pessoa1.contato = contato1;

        System.out.println("Ligue para o Yudi: " + contato1.numero);

    }


}
