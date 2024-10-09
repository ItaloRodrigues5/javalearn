public class Extrato {
    private Conta conta;

    public Extrato(Conta conta) {
        this.conta = conta;
    }

    public double exibirExtrato(){
        return conta.exibeExtrato();
    }
}
