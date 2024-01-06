
/**
 * Write a description of class ejercicio9 here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ejercicio9 {
    // El usuario debe ingresar los elementos de la matriz y el programa debe
    // mostrar el determinante de la matriz.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[][] matriz = new double[2][2];

        System.out.println("Ingrese los elementos de la matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = leer.nextDouble();
            }
        }

        double determinante = matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        System.out.println("El determinante de la matriz es: " + determinante);
    }
}
