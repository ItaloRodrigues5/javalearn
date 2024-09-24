public class Main{
    public static void main(String[] args){
         Pessoa p1 = new Pessoa();
         ContaPoupanca cp = new ContaPoupanca(1, 1000);
        
        p1.setNome("Xuxa");
        p1.setConta(cp);
        cp.sacar(500);
        cp.depositar(100);
        
        System.out.println(p1.toString());
        
    }
}
