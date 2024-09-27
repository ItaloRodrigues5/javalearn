import java.util.ArrayList;

public class ParqueDeDiversoes{
    private ArrayList<Atracao> atracoes = new ArrayList<>();
    private ArrayList<Visitante> visitantes = new ArrayList<>();
    private ArrayList<Ingresso> ingressos = new ArrayList<>();
    
    public void adicionarAtracao(Atracao atracao){
        atracoes.add(atracao);
        System.out.println("Atração: " + atracao.getNome() + " adicionada ao parque.");
    }
    
    public void listarAtracoes(){
        System.out.println("Atrações disponíveis no parque: ");
        
        for (Atracao atracao : atracoes){
            System.out.println(atracao);
        }
    }
    
    public void registrarVisitantes(Visitante visitante){
        visitantes.add(visitante);
        System.out.println("Visitante: " + visitante.getNome() + " adicionado com sucesso.");
    }
    
    public void venderIngresso(Visitante visitante, double preco){
        Ingresso ingresso = new Ingresso(visitante, preco);
        ingresso.venderIngresso();
        ingressos.add(ingresso);
    }
    
    public void getAtracoes(){
        for (int i = 0; i < atracoes.size(); i++){
            System.out.println(atracoes.get(i).getNome());
        }
    }
    
    public void getVisitantes(){
        for (int i = 0; i < visitantes.size(); i++){
            System.out.println(visitantes.get(i).getNome());
        }
    }
    
    public void getIngressos(){
        for (int i = 0; i < ingressos.size(); i++){
            System.out.println(ingressos.get(i).getVisitante().getNome());
        }
    }
}
