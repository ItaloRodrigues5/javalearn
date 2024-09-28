import java.sql.SQLOutput;
import java.util.ArrayList;

public class Hotel {
    ArrayList<Hospede> hospedes;
    ArrayList<Quarto> quartos = new ArrayList<>();

    public Hotel() {
        this.hospedes = new ArrayList<>();
    }

    public void TaxaOcupacao(Quarto numquarto, double taxa) {

        double valor = taxa * numquarto.getPreco();
        for (int i = 0; i < quartos.size(); i++) {
            if (numquarto == quartos.get(i + 1)) {
                System.out.println("O quarto de número " + i + " fica no valor de " + valor);
            }
        }
    }
}
