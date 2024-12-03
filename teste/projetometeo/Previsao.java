import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Previsao {
    @Id
    private Long id;
    private String cidade;
    private String temperatura;
    private String condicao;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }
    public String getTemperatura() { return temperatura; }
    public void setTemperatura(String temperatura) { this.temperatura = temperatura; }
    public String getCondicao() { return condicao; }
    public void setCondicao(String condicao) { this.condicao = condicao; }
}