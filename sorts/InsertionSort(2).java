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

    // Método para imprimir o array
    public static void imprimirArray(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

// Método main com medição de tempo
    public static void main(String[] args) {
        int[] numeros = {34, 7, 23, 32, 5, 62, 14, 2, 99, 45, 11, 19, 88, 1, 25, 77, 53, 6, 39, 17};

        System.out.println("Antes da ordenação:");
        InsertionSort.imprimirArray(numeros);

        // Marca o tempo antes da ordenação
        long inicio = System.nanoTime();

        // Executa a ordenação
        InsertionSort.insertionSort(numeros);

        // Marca o tempo após a ordenação
        long fim = System.nanoTime();

        System.out.println("Depois da ordenação:");
        InsertionSort.imprimirArray(numeros);

        // Calcula e exibe o tempo em milissegundos
        double duracao = (fim - inicio) / 1_000_000.0; // converte de nanos para milissegundos //1e6 tbm funciona
        System.out.printf("Tempo de execução: %.6f ms%n", duracao);
    }
}
