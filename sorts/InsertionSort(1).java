public class InsertionSort {

    // Método principal que executa o Insertion Sort
    public static void insertionSort(int[] array) {
        int n = array.length;

        // Começa do segundo elemento (índice 1)
        for (int i = 1; i < n; i++) {
            int chave = array[i]; // Valor atual a ser inserido no lugar correto
            int j = i - 1;

            // Move os elementos maiores que a chave para uma posição à frente
            while (j >= 0 && array[j] > chave) {
                array[j + 1] = array[j];
                j--;
            }

            // Insere a chave na posição correta
            array[j + 1] = chave;
        }
    }

    // Método auxiliar para imprimir o array
    public static void imprimirArray(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    // Método main para testar
    public static void main(String[] args) {
        int[] numeros = {5, 3, 4, 1, 2};

        System.out.println("Antes da ordenação:");
        imprimirArray(numeros);

        insertionSort(numeros);

        System.out.println("Depois da ordenação:");
        imprimirArray(numeros);
    }
}
