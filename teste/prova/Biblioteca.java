public class Biblioteca {

    public TipoLivro adicionarLivro(TipoLivro tipolivro){
        return tipolivro;
    }

    public TipoLivro emprestarLivro(TipoLivro tipolivro){
        return tipolivro;
    }

    public TipoLivro devolverLivro(TipoLivro tipolivro){
        return tipolivro;
    }

    public TipoLivro getLivro(Livro livro){
        return livro.getTipoLivro();
    }

    public String calcularMulta(int diasdeatraso, TipoLivro tipodelivro, String statusdomembro){

        
        int diasmaximo = 30;
        double multa = 0;

        for(diasdeatraso = 0; diasdeatraso < diasmaximo; diasdeatraso++){
            multa += 0.1;
        }

            if(statusdomembro == "ruim" || statusdomembro == "RUIM"){
                int taxa = 8;
    
                double valordamulta = (multa * diasdeatraso) * taxa;
    
                String format = String.format("%.2f", valordamulta);

                return format;
            }
            else if(statusdomembro == "bom" || statusdomembro == "BOM"){
                int taxa = 5;
    
                double valordamulta = (multa * diasdeatraso) * taxa;
                
                String format = String.format("%.2f", valordamulta);

                return format;
            }
            else{
                int taxa = 2;

                double valordamulta = (multa * diasdeatraso) * taxa;
                
                String format = String.format("%.2f", valordamulta);

                return format;
        }
        
    }
}
