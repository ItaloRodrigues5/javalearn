
public class Casamento extends Evento{

    public Casamento(){
        tipoEvento = tipoEvento.CASAMENTO;
    }
    
    @Override
    public void organizarEvento() {
    
    }
   @Override
    public void realizarEvento(){
        System.out.println("Casamento iniciado");
    }
}
