
public class Aniversario extends Evento{

    public Aniversario(){
        tipoEvento = TipoEvento.ANIVERSARIO;
    }

    @Override
    public void organizarEvento(){

    }
    @Override
    public void realizarEvento(){
        System.out.println("Aniversário iniciado");
    }

}
