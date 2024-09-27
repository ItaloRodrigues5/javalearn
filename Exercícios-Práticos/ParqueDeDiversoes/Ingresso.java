public class Ingresso{
    private Visitante visitante;
    private double preco;
    private boolean vendido = false;
    
    public Ingresso (Visitante visitante, double preco){
        this.visitante = visitante;
        this.preco = preco;
    }

    public void venderIngresso(){
        if (!vendido){
            this.vendido = true;
            System.out.println("Ingresso vendido para " + visitante.getNome() + " pelo valor de R$ " + this.preco);
        }
        else{
            System.out.println("Ingressso não vendido.");
        }
    }
    
    public void setPreco(){
        this.preco = preco;
    }
    
    public double getPreco(){
        return preco;   
    }
    
    public Visitante getVisitante(){
        return visitante;
    }
    
    public boolean getVendido(){
        return vendido;
    }
}