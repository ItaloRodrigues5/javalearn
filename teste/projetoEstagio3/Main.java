import java.util.logging.Logger;

public class Main extends Exception{
    
    @Override
    public String getLocalizedMessage(){
        return "Erro específico na localidade";
    }
    
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args){
        
        double x = -6.26493629848;
        double y = -57.2538264829;
        boolean validaNumero = false;

        while(!validaNumero){

            validaNumero = true;

            try{
                if(x < 0 && y < 0 || x > 0 && y < 0 || x < 0 && y > 0 || x > 0 && y > 0){
                    //Repassa a mensagem de erro, porém sem o logger aparece repetido no terminal.
                    throw new Exception("Número válido");
                }
                else{
                    throw new Exception("Número igual a 0");
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
}