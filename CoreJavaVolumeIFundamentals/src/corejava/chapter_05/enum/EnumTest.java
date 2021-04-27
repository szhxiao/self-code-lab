/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.util.Scanner;

/**
 * This program demonstrates enumrated types.
 */
public class EnumTest {
    public static void main(String[] args) {
        // get input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size: (SAMLL, MEDIUM, LARGE, EXTRA_LARGE)");

        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("abbreviation = " + size.getAbbreviation());
        
        if (size == Size.EXTRA_LARGE) {
            System.out.println("Good job -- you paid attention to the _.");
        }
    }
}

/**
 * Size
 */
enum Size {
    SMALL("S"), MEDINU("M"), LARGE("L"),EXTRA_LARGE("XL");

    private String abbreviation;

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    public String getAbbreviation() {
        return abbreviation;
    }
}