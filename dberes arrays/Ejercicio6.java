
/**
 * Write a description of class ejercicio6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la matriz:");
        int n = leer.nextInt();
        int[][] matriz = new int[n][n];
        int menor = 0;
        int menor2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese el valor de la posición [" + i + "][" + j + "]");
                matriz[i][j] = leer.nextInt();
                if (i == 0 && j == 0) {
                    menor = matriz[i][j];
                    menor2 = matriz[i][j];
                } else {
                    if (matriz[i][j] < menor) {
                        menor2 = menor;
                        menor = matriz[i][j];
                    } else if (matriz[i][j] < menor2 || menor == menor2) {
                        menor2 = matriz[i][j];
                    }
                }
            }
        }
        System.out.println("Matriz ingresada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("El primer número menor de la matriz es: " + menor);
        System.out.println("El segundo número menor de la matriz es: " + menor2);
    }
}

