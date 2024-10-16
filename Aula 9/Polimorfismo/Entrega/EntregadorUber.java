public class EntregadorUber extends Entregador{


    public abstract void gorjeta(double valor){
        super.saldo += valor;
    }
}
