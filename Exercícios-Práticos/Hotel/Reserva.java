public class Reserva {
    private Quarto quarto;
    private Hospede hospede;
    private int quantidadeDias;

    public Reserva(Quarto quarto, Hospede hospede, int quantidadeDias) {
        this.quarto = quarto;
        this.hospede = hospede;
        this.quantidadeDias = quantidadeDias;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public void totalEstadia(double precoestadia){
        double valor = quarto.getPreco() * quantidadeDias;

        System.out.println("O valor total da Estadia foi: " + valor);
    }
}
