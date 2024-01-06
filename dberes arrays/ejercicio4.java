
/**
 * Write a description of class ejercicio4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ejercicio4
{
    public static void main(String [] args){
        //Realizar un programa en JAVA que permita ingresar por el usuario los elementos de una matriz 
        // nxn. Luego, contar cuantos elementos de esa matriz son positivos y cuántos negativos.
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz");
        int n = leer.nextInt();
        float matriz[][] = new float [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese el valor de la posicion [" + i + "][" + j + "]");
                matriz[i][j] = leer.nextFloat();
            }
        }
        System.out.println("Matriz ingresada: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" | "+matriz[i][j] + " | ");
            }
            System.out.println();
        }
        int positivo = 0, negativo = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(matriz [i][j] > 0){
                    positivo = positivo + 1;
                }else{
                    if(matriz [i][j] < 0){
                    negativo = negativo + 1;  
                    }
            }
        }
        }
        System.out.println ("En su matriz hay: "+positivo+" numeros positivos");
        System.out.println ("En su matriz hay: "+negativo+" numeros negativos");
}
}
