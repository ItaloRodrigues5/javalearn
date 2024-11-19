public class Livro implements Emprestavel{
    protected TipoLivro tipolivro;
    protected static int livrosemprestados = 0;

    public Livro(TipoLivro tipolivro){
        this.tipolivro = tipolivro;
        livrosemprestados++;
    }

    public void emprestar(){
        System.out.println("Emprestado");
    }

    public void devolver(){
        System.out.println("Devolvido");
    }

    public TipoLivro getTipoLivro(){
        return tipolivro;
    }



}
