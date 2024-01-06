
/**
 * Write a description of class ejercicio5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class ejercicio5 {
    // Realizar un programa en JAVA que permita ingresar por el usuario los
    // elementos de una matriz
    // nxn. Luego, asignar a un vector todos los elementos positivos de esa matriz,
    // y asignar a otro
    // vector los elementos negativos. Finalmente, mostrar por pantalla los dos
    // vectores.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz");
        int n = leer.nextInt();
        int matriz[][] = new int[n][n];
        int vectorPositivo[] = new int[n * n];
        int vectorNegativo[] = new int[n * n];
        int contPositivo = 0;
        int contNegativo = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese el valor de la posicion [" + i + "][" + j + "]");
                matriz[i][j] = leer.nextInt();
                if (matriz[i][j] > 0) {
                    vectorPositivo[contPositivo] = matriz[i][j];
                    contPositivo = contPositivo + 1;
                } else {
                    vectorNegativo[contNegativo] = matriz[i][j];
                    contNegativo = contNegativo + 1;
                }
            }
        }
        System.out.println("Matriz ingresada");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Vector positivo");
        for (int i = 0; i < contPositivo; i++) {
            System.out.print(vectorPositivo[i] + " ");
        }
        System.out.println();
        System.out.println("Vector negativo");
        for (int i = 0; i < contNegativo; i++) {
            System.out.print(vectorNegativo[i] + " ");
        }
    }
}
