/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 
 */
public class SumTest {

    public static int numberSum(int value) {
        int sum = 0;
        for (int i = 0; i <= value; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        int sumAll = 0;
        // sumAll = numberSum(2);
        for (int i = 0; i <= 100; i++) {
            sumAll += numberSum(i);
        }
        System.out.println(sumAll);
    }
}

/**
 * output:
 * 171700
 */