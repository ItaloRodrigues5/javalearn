public class ContaCorrente extends Conta{
    double juros = 60;

    public ContaCorrente(int num, double saldo){
        super(num, saldo);
    }

    public double sacar(double valor) {
        super.saldo -= valor;
        return this.saldo;
    }

    public void depositar(double valor){
        super.saldo += valor + juros;
    }
}
