/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.util.*;

/**
 * This program demonstrates a do/while <> loop.
 */
public class Retirement2 {

        // read inputs
        Scanner input = new Scanner(System.in);

        System.out.print("How much money will you contribute every year? ");
        double payment = input.nextDouble();

        System.out.print("Insert rate in %: ");
        double interstRate = input.nextDouble();

        double balance = 0;
        int year = 0;

        String isTrue;

        // update account balance while user isn't ready to retire
        do {
            // add this year's payment adn interest
            balance += payment;
            double interst = balance * interstRate / 100;
            balance += interst;

            year++;

            // print current balance
            System.out.printf("After year %d, your balance is %,.2f%n", year, balance);

            // ask if ready to retire and get input
            System.out.print("Ready to retire? (Y/N)");
            isTrue = input.next();
        } while (isTrue.equals("N"));

}