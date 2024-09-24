public class Fatura{
    private String numero;
    private String desc;
    private int quantcomp;
    private double precopitem;
    
    
    public Fatura(String numero, String desc, int quantcomp, double precopitem){
        this.numero = numero;
        this.desc = desc;
        this.quantcomp = quantcomp; //Quantidade comprada de um item
        this.precopitem = precopitem; //Preço por item
    }
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public String getDesc(){
        return desc;
    }
    
    public void setDesc(String desc){
        this.desc = desc;
    }
    
    public int getQuant(){
        return quantcomp;
    }
    
    public void setQuant(int quantcomp){
        this.quantcomp = quantcomp;
    }
    
    public double getPreco(){
        return precopitem;
    }
    
    public void setPreco(double precopitem){
        this.precopitem = precopitem;
    }
    
    public double getTotalFatura(){
        double valortotal = this.quantcomp * this.precopitem;
        return valortotal;
    }
}
