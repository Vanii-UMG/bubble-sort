
public class App {
    public static void main(String[] args) {

        // Declaracion de matriz
        int[] vector = new int[9];
        int aux = 0;

        // Llenar la matriz con numeros aleatorios
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 50);
        }

        // Mostrar matriz de numeros desordenados
        System.out.println("Arreglo desordenado:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        // Ordenamiento de burbuja
        for (int j = 1; j < vector.length; j++) {
            for (int i = 1; i < vector.length; i++) {

                if (vector[i - 1] < vector[i]) {
                    aux = vector[i - 1];
                    vector[i - 1] = vector[i];
                    vector[i] = aux;
                }
            }
        }

        // Mostrar vector ordenado
        System.out.println("\n\tArreglo ordenado:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
}