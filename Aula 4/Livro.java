public class Livro {
    private String titulo;
    private String isbn;
    private Autor autor;

    public Livro (String titulo, String isbn, Autor autor){
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String nome){
        this.titulo = nome;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor(){
        return autor;
    }
}
