
/**
 * Write a description of class ciclos here.
 * 
 * @author (Jesus Chamorro)
 * @version (0.0.0.1)
 */
import java.util.Scanner;

public class ciclos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contrasena = 1234;
        boolean eleccion = false;
        do {

            System.out.println("Digite un numero del 1 al 5");
            System.out.println("1. Calcular el area de un triangulo");
            System.out.println("2. Calcular el area de un circulo");
            System.out.println("3. Calcular el area de un cuadrado");
            System.out.println("4. Calcular el area de un rectangulo");
            System.out.println("5. Juego adivina el numero");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Digite la base del triangulo");
                    int base = leer.nextInt();
                    System.out.println("Digite la altura del triangulo");
                    int altura = leer.nextInt();
                    int area = (base * altura) / 2;
                    System.out.println("El area del triangulo es: " + area);
                    break;
                case 2:
                    System.out.println("Digite el radio del circulo");
                    int radio = leer.nextInt();
                    double area2 = Math.PI * Math.pow(radio, 2);
                    System.out.println("El area del circulo es: " + area2);
                    break;
                case 3:
                    System.out.println("Digite el lado del cuadrado");
                    int lado = leer.nextInt();
                    int area3 = lado * lado;
                    System.out.println("El area del cuadrado es: " + area3);
                    break;
                case 4:
                    System.out.println("Digite la base del rectangulo");
                    int base2 = leer.nextInt();
                    System.out.println("Digite la altura del rectangulo");
                    int altura2 = leer.nextInt();
                    int area4 = base2 * altura2;
                    System.out.println("El area del rectangulo es: " + area4);
                    break;
                case 5:
                    for (int i = 0; i < 3; i++) {
                        System.out.println("ingrese la contrasena para jugar");
                        int contrasenaintento = leer.nextInt();
                        if (contrasenaintento == contrasena) {
                            System.out.println("Bienvenido al juego");
                            System.out.println("Adivina el numero");
                            int numero = (int) (Math.random() * 10);
                            int intentos = 0;
                            int numero2 = 0;
                            while (numero != numero2) {
                                System.out.println("Digite un numero del 0-9");
                                numero2 = leer.nextInt();
                                if (numero2 > numero) {
                                    System.out.println("El numero es menor");
                                } else if (numero2 < numero) {
                                    System.out.println("El numero es mayor");
                                }
                                intentos++;
                            }
                            System.out.println("Felicidades adivinaste el numero");
                            System.out.println("Numero de intentos: " + intentos);
                            break;
                        } else if (i == 2) {
                            System.out.println("Has agotado tus intentos");
                            System.exit(0);
                        } else {
                            System.out.println("contrasena incorrecta");
                        }
                    }
                    break;
                default:
                    System.out.println("Error, Opcion no valida");
            }
            System.out.println("Desea continuar si/no?");
            char respuesta = leer.next().charAt(0);
            if (respuesta == 's') {
                System.out.println("------Bienvenido de nuevo------");
                eleccion = true;
            } else if (respuesta == 'n') {
                System.out.println("------Gracias por usar------");
                break;
            }
        } while (eleccion);
        leer.close();
    }

}
