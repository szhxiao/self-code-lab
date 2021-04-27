/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.time.*;

/**
 * This program demonstrates Calendar class.
 */
public class CalendarTest {

    public static void main(String[] args) {

        // get current time
        LocalDate date = LocalDate.now();           
        int month = date.getMonthValue();           
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);           // set to start f month 
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();             // Monday=1,...Sunday=7

        System.out.println(" Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("   ");
        }

        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            // use '*' to label the current day
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }
}

/*
output:

*/