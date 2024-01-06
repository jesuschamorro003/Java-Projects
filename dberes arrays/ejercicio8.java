
/**
 * Write a description of class ejercicio8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la matriz:");
        int n = leer.nextInt();

        int[][] matriz = new int[n][n];

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }

        int max = matriz[0][0];
        int min = matriz[0][0];
        double sum = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
            int elemento = matriz[i][j];

            if (elemento > max) {
            max = elemento;
            }
            if (elemento < min) {
            min = elemento;
            }
            sum += elemento;
        }
      }


        double promedio = sum / (n * n);

        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);
        System.out.println("El promedio es: " + promedio);
    }
}
