
/**
 * Write a description of class ejercico_1 here.
 * 
 * @author (Jesus Chamorro) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class ejercico_1 {
    // Determinar el numero de menor de tres numeros ingresados por teclado
    public static void main(String[] args) {
        int menor;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        System.out.println("Ingrese el tercer numero");
        int num3 = leer.nextInt();
        menor = (Math.min(Math.min(num1, num2), num3));
        System.out.println("El numero menor es: " + menor);
        leer.close();
    }
}
