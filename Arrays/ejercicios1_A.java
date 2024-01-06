
/**
 * Write a description of class ejercicios1_A here.
 * 
 * @author (Jesus Chamorro) 
 * @version (0.0.0.4)
 */
import java.util.Scanner;

public class ejercicios1_A {
    public static void main(String[] args) {
        boolean op = true;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de los elementos a ingresar");
        int num = leer.nextInt();
        int[] vector = new int [num];
        float suma = 0;
        


        do {
            System.out.println ("Ingrese el numero de ejercicio que desee realizar");
            System.out.println ("1) Sumar los valores de un vector");
            System.out.println ("2) Sacar el promedio de los valores de un vector");
            System.out.println ("3) Permite revisar si un vector tiene el valor de 5");
            System.out.println ("4) Enconrar el max o el min de un vector");
            System.out.println ("5) Permite revisar si un vector tienen numeros duplicados");
            int opcion = leer.nextInt();
            switch (opcion) {
                // ejercio1
                case 1:
                    for (int i = 0; i < num; i++) {
                        System.out.println("Ingrese el valor del vector en la posicion " + i);
                        vector[i] = leer.nextInt();
                        suma = suma + vector[i];
                    }
                    System.out.println("La suma de los valores del vector es: " + suma);
                    break;
                    // ejercicio2
                case 2:
                    for (int i = 0; i < num; i++){
                      System.out.println ("Ingrese el valor del vector en la posicion " + i);
                      vector [i] = leer.nextInt();
                      suma = suma + vector [i];
                    }
                    float prom = suma/num;
                      System.out.println ("El promedio de los valores del vector es: " + prom);
                      break;
                      //ejercicio 3
                case 3:
                    for (int i = 0; i < num; i++){
                        System.out.println ("Ingrese el valor del vector en la posicion " + i);
                        vector [i] = leer.nextInt();
                    }
                    int aux = 0;
                    for (int i = 0; i < num; i++){
                        if (vector[i] == 5){
                            System.out.println ("El valor 5 se encuentra en la posicion " + i);
                        }else{
                            aux++;
                        }   
                    }
                    if (aux == num){
                        System.out.println("No hay ningun valor 5 ingresado");

                    }
                    break;
                case 4:
                        for(int i = 0; i < num; i++){
                            System.out.println ("Ingrese el valor del vector en la posicion: " + i);
                            vector[i] = leer.nextInt();
                        }
                        int mayor = vector[0], min = vector[0];
                        for(int i = 0; i < num; i++){
                            if (mayor < vector[i]){
                                mayor = vector [i];
                            }
                            if(min > vector[i]){
                                min = vector [i];
                            }
                        }
                        
                        System.out.println ("El numero maximo del vector es: " + mayor);
                        System.out.println ("El numero minimo del vector es: " + min);
                        break;
                case 5:
                        for(int i = 0; i < num; i++){
                            System.out.println("Ingrese el valor del vector en la posicion: " + i);
                            vector[i] = leer.nextInt();
                        }
                        int aux2 = 0,duplicado = 0;
                        for(int i = 0; i < num; i++){
                           if (aux2 == vector[i]){
                               aux2 = vector[i];
                               duplicado = duplicado + 1;
                            }else{
                                aux2 = vector[i];
                           }
                        }
                        System.out.println ("Hay "+duplicado+" numeros duplicados");
                        break;
                        default:
                            System.out.println ("El numero ingresado esta fuera de rango");
                            op = false;
                        break;
            }
        } while (op);

    }
}