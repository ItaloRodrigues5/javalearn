public class Series {
    private String nome;
    private String studio;

    public Series(String nome, String studio){
        this.nome = nome;
        this.studio = studio;
    }

    public String getNome(){
        return nome;
    }

    public String getStudio(){
        return studio;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setStudio(String studio){
        this.studio = studio;
    }

    public String toString(){
        return "Nome: " + nome + " Studio: " + studio;
    }
}
