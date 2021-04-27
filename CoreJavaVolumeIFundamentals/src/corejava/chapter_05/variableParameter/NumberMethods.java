/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

public class NumberMethods {

    /**
     * get maximum number
     * 
     * @param values numbers
     * @return the maximum number
     */
    public static double getMax(double... values) {
        double maximum = Double.NEGATIVE_INFINITY;
        for (double v : values) {
            if (v > maximum) {
                maximum = v;
            }
        }
        return maximum;
    }

    /**
     * get minimum number
     * 
     * @param values numbers
     * @return the miminum number
     */
    public static double getMin(double... values) {
        double minimum = Double.POSITIVE_INFINITY;
        for (double v : values) {
            if (v < minimum) {
                minimum = v;
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        double[] number = {3.1, 2.8, 15.6, 20.9, -50.2, 355.4};
        double max = getMax(number);
        double min = getMin(number);
        System.out.println("The maximum number in array is " + max);
        System.out.println("The minimum number in array is " + min);
    }
}

/**
output:
The maximum number in array is 355.4
The minimum number in array is -50.2
 */