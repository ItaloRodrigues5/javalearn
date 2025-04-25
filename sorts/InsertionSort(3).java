import java.util.Random;

public class InsertionSort {

    // Método de ordenação com Insertion Sort
    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int chave = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > chave) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = chave;
        }
    }

    // Gera um array de tamanho 'n' com números aleatórios
    public static int[] gerarArrayAleatorio(int n) {
        Random rand = new Random();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(100_000); // valores entre 0 e 99.999
        }

        return array;
    }

    public static void main(String[] args) {
        int tamanho = 100_000; // você pode reduzir se travar
        int[] numeros = InsertionSort.gerarArrayAleatorio(tamanho);

        System.out.println("Ordenando array com " + tamanho + " elementos usando Insertion Sort...");

        long inicio = System.nanoTime();
        InsertionSort.insertionSort(numeros);
        long fim = System.nanoTime();

        double duracao = (fim - inicio) / 1_000_000.0;
        double resultado = duracao / 1000;
        System.out.printf("Tempo de execução: %.2f ms%n", resultado);
    }
}
