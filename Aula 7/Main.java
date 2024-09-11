public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        ContaPoupanca cp = new ContaPoupanca(1,100);
        ContaCorrente cc = new ContaCorrente(2, 2000);

        p1.setNome("Pablo");
        p1.setConta(cp);
        System.out.println(p1);
        cp.depositar(100);
        cp.sacar(50);
        System.out.println(p1);

        p2.setNome("Xuxa");
        p2.setConta(cc);
        System.out.println(p2);
        cc.depositar(100);
        cc.sacar(50);
        System.out.println(p2);

    }
}
