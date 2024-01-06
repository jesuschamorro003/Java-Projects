
/**
 * Generar la siguiente serie 1, 3, 5, 7... hasta los n primeros numeros
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class loop
{
    public static void main(String []args){
        Scanner leer = new Scanner(System.in);
        int i;
        i = 0;
        System.out.println ("Ingrese la cantidad de numeros que desea generar");
        int num = leer.nextInt();
        int aux = 1;
        for(i = 1 ; i <= num; i++){
            System.out.println(i+")"+aux);
            aux = aux + 2;
        }
        
    }
}
