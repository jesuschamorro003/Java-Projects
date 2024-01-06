
/**
 * Write a description of class ejercicio1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ejercicio1
{
    public static void main (String [] args){
        //Realizar un programa que permita asignar en la matriz A, 1 a cada espacio, y en la matriz B, 2 a
        //cada espacio.
        Scanner leer = new Scanner (System.in);
        System.out.println ("Ingrese la dimesion de la matriz cuadrada");
        int n  = leer.nextInt();
        int mA [][] = new int [n][n]; 
        int mB [][] = new int [n][n];
        for (int i=0; i < n;i++){
            for(int j=0; j < n; j++){
                mA [i][j]=1;
            }
            
        }
        
        System.out.println ("La matriz A es: ");
        for (int i=0; i < n;i++){
            for(int j=0; j < n; j++){
                System.out.print (mA [i][j]+ " ");
            }
            System.out.println ();
        }
        
        for (int i=0; i < n;i++){
            for(int j=0; j < n; j++){
                mB [i][j]=2;
            }
            
        }
        
        System.out.println ("La matriz B es: ");
        for (int i=0; i < n;i++){
            for(int j=0; j < n; j++){
                System.out.print (mB [i][j]+ " ");
            }
            System.out.println ();
        }
        
    }
}
