public class Pedido {
    private String produto;
    private int quantidade;
    private double valor;

    //Criar uma instancia vazia
    public Pedido(){

    }

    //Criar uma instancia com apenas 1 valor obrigatório
    public Pedido(String produto){
        this.produto = produto;
    }

    //Criar uma instancia com 3 valores obrigatórios
    public Pedido(String produto, int quantidade, double valor){
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    //Metodo calcular o Pedido sem inserção de valores, pois os valores são direto da Classe Pedido
    public double calculaPedido(){
        return this.valor * this.quantidade;
    }

    //Metodo calcular o Pedido com inserção de valores obrigatórios
    public double calculaPedido(int quantidade, double valor){
        return quantidade * valor;
    }

    //Metodo calcular o Pedido com inserção de valores obrigatórios e com taxa de entrega
    public double calculaPedido(int quantidade, double valor, double entrega){
        return quantidade * valor + entrega;
    }

}
