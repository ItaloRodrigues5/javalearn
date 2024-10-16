public class EntregadorMoto extends Entregador{

    public void entregaPedido(Pedido p){
        System.out.println("Entregador chegando de moto, fique no aguardo.");
    }

    public abstract void gorjeta(double valor){
        super.saldo += valor - (valor * 0.5);
    }
}
