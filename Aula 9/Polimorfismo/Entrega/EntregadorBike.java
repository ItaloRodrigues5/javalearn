public class EntregadorBike extends Entregador{

    @Override
    public void entregaPedido(Pedido p){
        System.out.println("Entregador chegando de Bike, fique no aguardo.");
    }

    public abstract void gorjeta(double valor){
        super.saldo += valor;
    }

}
