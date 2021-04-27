/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.util.*;

/**
 * This program demonstrates a while loop.
 */
public class Retirement {

    public static void main(String[] args) {
         // read inputs
        Scanner input = new Scanner(System.in);

        System.out.print("How much money do you need to retire? ");
        double goal = input.nextDouble();
 
        System.out.print("How much money will you contribute every year? ");
        double payment = input.nextDouble();
 
        System.out.print("Insert rate in %: ");
        double interstRate = input.nextDouble();
 
        double balance = 0;
        int years = 0;
 
        // update account blance while goal isn't reached
        while (balance < goal) {
            // add this year's payment and interest
            balance += payment;
             double interst = balance * interstRate / 100;
            balance += interst;
            years ++;
        }
 
        System.out.println("You can retire in " + years + " years.");
    }

}
