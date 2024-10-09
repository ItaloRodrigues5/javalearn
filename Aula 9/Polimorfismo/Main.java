public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        Extrato ex = new Extrato(cc);
        cc.deposita(100);

        System.out.println(cc.exibeExtrato());
    }
}
