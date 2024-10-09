public class ContaCorrente extends Conta{
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void deposita(double valor){
        super.saldo += valor;
    }

    public void deposita(double valor, double dolar){
        super.saldo += (valor * dolar);
    }

    @Override
    public void saque(double valor){
        super.saldo -= (valor - (valor * 0.1));
    }
    
    public double exibeExtrato(){
        
    }
}

