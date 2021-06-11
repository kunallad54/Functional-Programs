/**
 * The program takes two double command-line arguments t
 * and v and prints the wind chill. Using Math.pow(a, b) to compute ab. Given the
 * temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
 * National Weather Service defines the effective temperature (the wind chill) to be:
 *
 * @author Krunal Lad
 * @version 1.0
 * @since 11-06-2021
 */

public class WindChill {
    public static void main(String[] args) {

        // taking two double command line arguments
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args [1]);

        // get the value of v^0.16
        double powerOfV = Math.pow(v,0.16);

        //Formula for WindChill
        double w = 35.74 + 0.6215 +(0.4275 * t - 35.75)*powerOfV;
        System.out.println("The value of Wind Chill : "+w);
    }
}
