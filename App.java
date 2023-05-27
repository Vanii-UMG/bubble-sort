

public class App{
    public static void main(String[] args) {

        //Declaracion de matriz
        int[] vector = new int[9];
        int aux = 0;

        //Llenar la matriz con numeros aleatorios
        for(int i = 0; i < vector.length; i++){
            vector[i] = (int) (Math.random()*50);
        }

        //Mostrar matriz de numeros desordenados
        System.out.println("Arreglo desordenado:");
        for(int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }

        //Ordenamiento de burbuja
        for(int i = 0; i < vector.length; i++){
            if(vector[i] < vector[i+1]){
                aux = vector[i];
                vector[i] = vector[i+1];
            }
        }

        //Mostrar vector ordenado
        System.out.println("Arreglo ordenado:");
        for(int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }
    }
}