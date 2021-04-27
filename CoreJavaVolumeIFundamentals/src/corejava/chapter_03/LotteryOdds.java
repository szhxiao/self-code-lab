/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

 import java.util.*;

 /**
  * This program demonstrates a for loop.
  */
public class LotteryOdds {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = input.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = input.nextInt();

        /**
         * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
         */
        
        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds * (n - i + 1) / i;
        }
        System.out.println("Your odds are 1 in " + lotteryOdds + ", Good luck!");
    }
}