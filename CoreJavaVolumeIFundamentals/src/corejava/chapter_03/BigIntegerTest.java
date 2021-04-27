/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.math.*;
import java.util.*;

/**
 * This program demonstrates BigInteger
 */
public class BigIntegerTest {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw? ");
        int k = in.nextInt();
        
        System.out.println("What is the highest number you dan draw? ");
        int n = in.nextInt();
        
        /**
          * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
          */

        BigInteger lotteryOdds = BigInteger.valueOf(1);

        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1).divide(
                BigInteger.valueOf(i)));
            }
            
        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
    }
}