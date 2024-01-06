
/**
 * Write a description of class ejercicio_5 here.
 * 
 * @author (Jesus Chamorro) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class ejercicio_5 {
    // Determinar el numero mayor de tres numeros ingresados
    public static void main(String[] args) {
        int mayor;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        System.out.println("Ingrese el tercer numero");
        int num3 = leer.nextInt();
        if (num1 > num2 && num2 > num3) {
            mayor = num1;
            System.out.println("El numero mayor de los tres numeros ingresados es: " + mayor);
        } else {
            if (num2 > num3 && num3 > num1) {
                mayor = num2;
                System.out.println("El numero mayor de los tres numeros ingresados es: " + mayor);
            } else {
                mayor = num3;
                System.out.println("El numero mayor de los tres numeros ingresados es: " + mayor);
            }
        }

        leer.close();

    }
}
