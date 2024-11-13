
public abstract class Evento implements Organizavel{
    protected TipoEvento tipoEvento;
    protected static int totalparticipantes = 0;

    abstract public void realizarEvento();

    @Override
    public void organizarEvento() {
        System.out.println("Organizando evento do tipo: " + tipoEvento);
    }

    public String calcularCustoEvento(int totalparticipantes, int duracaodoevento, TipoEvento tipoEvento, int servicosadicionais){

        int valorparticipantes = 50;
        int valorporduracaohora = 50;
        int valorservicopadrao = 100;

        double valordoevento = 0;
        
        while(totalparticipantes != 0){
            
            valordoevento = ((totalparticipantes * valorparticipantes) + (valorporduracaohora * duracaodoevento) + (servicosadicionais * valorservicopadrao));

            if(tipoEvento == TipoEvento.ANIVERSARIO){
                valordoevento += 100;
            }
            else if(tipoEvento == TipoEvento.CASAMENTO){
                valordoevento += 500;
            }
            else if(tipoEvento == TipoEvento.CONFERENCIA){
                valordoevento += 150;
            }
            else{
                valordoevento += 200;
            }
        }
        
        String format = String.format("%.2f", valordoevento);
        return format;
    
    }

    // public void imprimirevento(){
    //     System.out.println(calcularCustoEvento(20, 3, TipoEvento.CASAMENTO, 5));
    // }

    public void adicionaParticipante(int participantes){

    }

    public static int getTotalParticipantes(){
        return totalparticipantes;
    }

}
