
/**
 * Write a description of class ejercicio10 here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ejercicio10 {
    // Ingresar el tamano de la matriz y los datos, sumar la diagonal principal y la
    // diagonal inversa
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
        
        System.out.println("Su matriz ingresada es: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < matriz.length; i++) {
            sum1 += matriz[i][i];
            sum2 += matriz[i][matriz.length - 1 - i];
        }

        System.out.println("La suma de la diagonal principal es: " + sum1);
        System.out.println("La suma de la diagonal inversa es: " + sum2);
    }

}
