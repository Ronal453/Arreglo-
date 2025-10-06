package ejearreglo;

import static ejearreglo.RecorridoArreglo.mostrarArregloIterativo;
import static ejearreglo.RecorridoArreglo.mostrarArregloRecursivo;

public class EjeArreglo {

    public static void main(String[] args) {
        
        System.out.println("    RECORRIDO DE ARREGLOS");
        
        // Crear un arreglo de ejemplo
        int[] numeros = {10, 25, 38, 42, 57, 63, 79, 81, 94, 100};
        
        System.out.println("Arreglo predefinido:");
        System.out.print("Contenido: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        // Mostrar usando método iterativo
        mostrarArregloIterativo(numeros);
        
        // Mostrar usando método recursivo
        System.out.println("\nRecorrido RECURSIVO:");
        System.out.println("Indice   Valor");
        mostrarArregloRecursivo(numeros, 0);
        
    }
}