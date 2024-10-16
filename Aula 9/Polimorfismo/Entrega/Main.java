public class Main{
    public static void main(String[] args) {

        Pedido p0 = new Pedido();
        Pedido p1 = new Pedido("pipoca");
        Pedido p2 = new Pedido("pudim", 2, 4);
        Pedido p3 = new Pedido("xuxa", 1, 5);

        //Metodo calcular o Pedido sem inserção de valores, pois os valores são direto da Classe Pedido
        System.out.println(p2.calculaPedido());

        //Metodo calcular o Pedido com inserção de valores obrigatórios
        System.out.println(p3.calculaPedido(1, 5));

        //Metodo calcular o Pedido com inserção de valores obrigatórios e com taxa de entrega
        System.out.println(p2.calculaPedido(2, 4, 7));

        //Entregador entregador = new Entregador(); Não pode
        //Entregador entregador = new EntregadorBike(); Pode

        EntregadorBike eb = new EntregadorBike();
        EntregadorMoto em = new EntregadorMoto();

        eb.entregaPedido();
        em.entregaPedido();

        Entregador entregadores[] = new Entregador[2];
        entregadores[0] = new EntregadorBike();
        entregadores[1] = new EntregadorMoto();

        EntregadorUber e1 = new EntregadorUber();

        entregadores[0].entregaPedido(p2);
        entregadores[1].entregaPedido(p3);

        Estabelecimento e1 = new Estabelecimento();

        e1.entregaPedido(eb, p3);

        Premium pr1 = new Premium();

        eb.calculaFidelidade(pr1, 4);
    }
}
