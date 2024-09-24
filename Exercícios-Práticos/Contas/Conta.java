public class Conta{
    private int numero;
    protected double saldo;
    
    public Conta(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
}
