
/**
 * Write a description of class ejercicio_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class ejercicio_2 {
    // Sacar el promedio,maximo y minimo de 4 numeros ingresados por teclado
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        System.out.println("Ingrese el tercer numero");
        int num3 = leer.nextInt();
        System.out.println("Ingrese el cuarto numero");
        int num4 = leer.nextInt();
        int promedio = (num1 + num2 + num3 + num4) / 4;
        int maximo = (Math.max(Math.max(num1, num2), Math.max(num3, num4)));
        int minimo = (Math.min(Math.min(num1, num2), Math.min(num3, num4)));
        System.out.println("El promedio de los numeros ingresados es: " + promedio);
        System.out.println("El numero maximo de los numeros ingresados es: " + maximo);
        System.out.println("El numero minimo de los numeros ingresados es: " + minimo);
        leer.close();
    }

}
