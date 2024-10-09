public class Conta {
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saque(double valor) {
        this.saldo -= valor;
    }

    public double exibeExtrato() {
        return this.saldo;
    }
}
