/**
 * The program takes two integer command-line arguments x
 * and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
 * formulae to calculate distance = sqrt(x*x + y*y). Use Math.sqrt function
 *
 * @author Krunal Lad
 * @version 1.0
 * @Since 11-06-2021
 */

public class Distance {

    public static void main(String[] args) {

        // taking two integer command line arguments
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        // Euclidean distance formula from origin to end points i.e here (x1,y1) = (0,0)
        // Euclidean distance formula = sqrt((x2 - x1)^2 + (y2 - y1)^2 )
        double distance = Math.sqrt(x * x + y * y);
        System.out.println("The Euclidean Distance is : "+distance);
    }
}
