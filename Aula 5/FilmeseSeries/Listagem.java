import java.util.ArrayList;

public class Listagem {
    ArrayList<Filmes> filmes = new ArrayList<>();
    ArrayList<Series> series = new ArrayList<>();

    public void getFilmes(){
        for(Filmes filmes: filmes){
            System.out.println(filmes.toString());
        }
    }

    public void setFilmes(Filmes filmes){
        this.filmes.add(filmes);
    }

    public void setSeries(Series series){
        this.series.add(series);
    }
}
