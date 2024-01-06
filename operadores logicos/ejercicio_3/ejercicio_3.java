
/**
 * Write a description of class ejercicio_3 here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class ejercicio_3 {
    // Que tan lejos esta el punto (-4,6) desde el origen.
    // Calcular los lados que forman parte del triangulo rectangulo
    public static void main(String[] args) {
        double x = -4;
        double y = 6;
        double distancia = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("La distancia es: " + distancia);
        // calcular los lados del triangulo rectangulo//
        double lado1 = Math.abs(x);
        double lado2 = Math.abs(y);
        System.out.println("El lado 1 es: " + lado1);
        System.out.println("El lado 2 es: " + lado2);

    }

}
