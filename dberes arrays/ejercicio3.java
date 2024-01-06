
/**
 * Write a description of class ejercicio3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Realizar un programa en JAVA que permita ingresar por el usuario los
        // elementos de una matriz
        // nxn. Luego, calcular su matriz identidad.
        System.out.println("Ingrese el tamaño de la matriz");
        int n = leer.nextInt();
        int matriz[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese el valor de la posicion [" + i + "][" + j + "]");
                matriz[i][j] = leer.nextInt();
            }
        }
        System.out.println("Matriz ingresada");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz identidad");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
