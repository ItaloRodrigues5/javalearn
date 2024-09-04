import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();

        int count = 0;

        while(count < 10){
            lista.add(scanner.nextLine());
            count++;
        }

        for (int i = 0; i < lista.size(); i++){
            
            System.out.println(lista.get(i));
        }

        lista.remove("xuxa");

        System.out.println(lista);
        System.out.println(lista.size());
        System.out.println(lista.get(0));

    }
}
