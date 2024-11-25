import java.util.logging.Logger;

public class Main extends Exception{
    
    @Override
    public String getLocalizedMessage(){
        return "Erro específico na localidade";
    }
    
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args){
        
        int xuxa = 6;

        try{
            if(xuxa == 6){
                //Repassa a mensagem de erro, porém sem o logger aparece repetido no terminal.
                throw new Exception("Valor não é 6");
            }
        }catch(Exception e){
            
            //Usar o logger para ser a mensagem a ser seguida logo acima.
            logger.severe("Xuxa " + e.getMessage());

            //Imprime apenas a mensagem personalizada de erro feita no try
            System.err.println("\n"+e.getMessage());
            
            //Imprime o valor de erro completo com a classe e a linha do erro + a mensagem personalizada no try
            e.printStackTrace();
            
            //Mensagem do erro separada dos detalhes a mais
            System.out.println(e.getLocalizedMessage());
            
            //Classe de erro
            System.out.println(e.getClass());
            
            //Causa do erro
            System.out.println(e.getCause());
            
            // printStackTrace() suprimido com detalhes por cima, além de imprimir a referência no lugar do nome da variável armazenada.
            System.out.println(e.getSuppressed());
            
        }
        finally{
            System.out.println("\nXuxa");
        }
        
    }
}