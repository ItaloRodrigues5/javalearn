public class Main {
    public static void main(String[] args) {

        Hotel hotel1 = new Hotel();

        Quarto q1 = new Quarto(1, 40.00);

        Quarto q2 = new Quarto(2, 50.00);

        Hospede h1 = new Hospede("Xuxa", 1);

        Hospede h2 = new Hospede("Pablo", 2);

        System.out.println(h2.toString());
        Reserva r1 = new Reserva(q2, h2, 30);
        h2.aplicaFidelidade(r1);

        System.out.println(h1.toString());
        hotel1.TaxaOcupacao(q1, 0.5);



        r1.totalEstadia(30.00);




    }
}