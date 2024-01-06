
/**
 * Write a description of class ejercicio_4 here.
 * 
 * @author (Jesus Chamorro)
 * @version (a version number or a date)
 */
public class ejercicio_4 {
    // Encontrar la distancia entre los puntos (4,7) y (1,-6)
    public static void main(String[] args) {
        double x1 = 4;
        double y1 = 7;
        double x2 = 1;
        double y2 = -6;
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("La distancia entre los puntos es: " + distancia);
    }
}
