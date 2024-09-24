public class ContaPoupanca extends Conta{
    private double taxa = 0.1;
    
    public ContaPoupanca(int numero, double saldo){
        super(numero, saldo);
    }
    
    public double sacar(double valor){
        super.saldo -= valor;
        return super.saldo;
    }
    
    public double depositar(double valor){
        super.saldo += (valor * this.taxa);
        return super.saldo;
    }
}
