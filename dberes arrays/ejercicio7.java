
/**
 * Write a description of class ejercicio7 here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de filas de la matriz:");
        int m = scanner.nextInt();

        System.out.println("Ingrese el número de columnas de la matriz:");
        int n = scanner.nextInt();

        int[][] matriz = new int[m][n];

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
            System.out.println("La matriz ingresada es:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        int[][] transpuesta = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        System.out.println("La matriz transpuesta es:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}