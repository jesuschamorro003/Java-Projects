
/**
 * Write a description of class ejercicio2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ejercicio2
{
    public static void main (String [] args){
        //Utilizando las matrices ya definidas arriba, crear dos matrices, suma y resta. En la primera sumar
        //A+B y en la segunda restar A-B.
        Scanner leer = new Scanner (System.in);
        System.out.println ("Ingrese la dimesion de la matriz cuadrada");
        int n  = leer.nextInt();
        int mA [][] = new int [n][n]; 
        int mB [][] = new int [n][n];
        int suma[][] = new int [n][n];
        int resta[][] = new int[n][n];
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
        System.out.println("La suma de A + B es: ");
    
        for (int i=0; i < n;i++){
            for(int j=0; j < n; j++){
                suma[i][j] =mA [i][j] + mB [i][j]  ;
                System.out.print (suma [i][j]+ " ");
            }
            System.out.println (); 
        }
        System.out.println("La resta de A - B es: ");
    
        for (int i=0; i < n;i++){
            for(int j=0; j < n; j++){
                suma[i][j] =mA [i][j] - mB [i][j]  ;
                System.out.print (suma [i][j]+ " ");
            }
            System.out.println (); 
        }
        
}
}
