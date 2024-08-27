public class Main{
    public static void main(String[] args) {

        Personagem p1 = new Personagem("Mario");
        Kart k1 = new Kart("vermelho", 20);
        p1.setKart(k1);

        p1.acelera(100);
    }
}
