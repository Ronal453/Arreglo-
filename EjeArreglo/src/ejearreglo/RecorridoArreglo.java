package ejearreglo;

public class RecorridoArreglo {
     public static void mostrarArregloIterativo(int[] arreglo) {
        System.out.println("\nRecorrido ITERATIVO:");
        System.out.println("Indice   Valor");
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("  [" + i + "]       " + arreglo[i]);
        }
    }
    
    /**
     * Recorre un arreglo mostrando índice y valor (versión recursiva)
     */
    public static void mostrarArregloRecursivo(int[] arreglo, int indice) {
        // Caso base: cuando llegamos al final del arreglo
        if (indice >= arreglo.length) {
            return;
        }
        
        // Mostrar el elemento actual
        System.out.println("  [" + indice + "]       " + arreglo[indice]);
        
        // Llamada recursiva para el siguiente elemento
        mostrarArregloRecursivo(arreglo, indice + 1);
    }
}
