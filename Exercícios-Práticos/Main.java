import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        Fatura fatura1 = new Fatura("1", "xuxa", 10, 5);
        
        System.out.println(fatura1.getTotalFatura());
    }
}
