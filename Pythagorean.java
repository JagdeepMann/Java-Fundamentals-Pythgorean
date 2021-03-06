// Import Scanner class
import java.util.Scanner;
// Import Math class
import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB
        double rhs = (Math.pow(legA,2)) + (Math.pow(legB,2));
        double hypotenuse = Math.sqrt(rhs);
        return hypotenuse;
    }
}

