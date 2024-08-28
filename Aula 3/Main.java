public class Main{
    public static void main(String[] args) {
        int vetor[] = new int [10];
        int cont = 0;
        
        for (int i = 0; i < 3; i++){
            vetor[i] = cont++; 
            //Realizar a soma antes da operação: ++cont;
            //Realizar a soma depois da operação: cont++;
        }

        for(int i = 0; i < 3; i++){
            System.out.println(vetor[i]);
        }
    }
}
