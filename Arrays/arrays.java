
/**
 * Write a description of class arrays here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class arrays {
   public static void main(String[] args) {
      
      Scanner leer = new Scanner(System.in);
      int[] guess = new int[10];
      for (int i = 0; i <=9; i++) {
         System.out.println("Ingrese un numero para el vector en la posicion: "+i);
         guess[i] = leer.nextInt();
      }
      
      for (int i = 0; i <=9; i++) {
         System.out.println("Vector en la posicion "+i+" es: "+guess[i]);
      }

   }
}
