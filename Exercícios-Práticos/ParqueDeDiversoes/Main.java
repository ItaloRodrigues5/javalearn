public class Main{
    public static void main(String[] args){
     
        ParqueDeDiversoes pdd = new ParqueDeDiversoes();
        
        MontanhaRussa mr = new MontanhaRussa();
        CarrosselGigante cg = new CarrosselGigante();
        
        pdd.adicionarAtracao(mr);
        pdd.adicionarAtracao(cg);
        
        
        pdd.listarAtracoes();
        
        Visitante v1 = new Visitante("Xuxa", 21);
        Visitante v2 = new Visitante("Pablo", 22);
        
        pdd.registrarVisitantes(v1);
        pdd.registrarVisitantes(v2);
        
        pdd.venderIngresso(v1, 25.00);
        pdd.venderIngresso(v2, 50.00);
        
    }
}
