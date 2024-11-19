public class Agendamento {
    private int dia;
    private int mes;
    private int ano;
    private String motivo;

    public Agendamento(int dia, int mes, int ano, String motivo) {
        validaData(dia, mes, ano, motivo);

    }

    @Override
    public String toString() {
        return "Agendamento Motivo: " + this.motivo + "\nDia: " + this.dia + "/" + this.mes
                + "/" + this.ano;
    }

    public void alteraData(int dia, int mes, int ano, String motivo) {
        this.validaData(dia, mes, ano, motivo);
    }

    private void validaData(int dia, int mes, int ano, String motivo) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
            if (mes >= 1 && mes <= 12) {
                this.mes = mes;
                if (ano >= 2024) {
                    this.ano = ano;
                    this.motivo = motivo;
                    System.out.println("Agendado com sucesso!");
                } else {
                    System.out.println("Ano Inválido!");
                }
            } else {
                System.out.println("Mês Inválido!");
            }
        } else {
            System.out.println("Dia Inválido!");
        }
    }

}
