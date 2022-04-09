/**
 * Effective Java
 *
 * @version 2nd
 * @author Joshua Bloch
 * @see
 */

import java.math.BigDecimal;
import java.math.BigInteger;

public class MonetaryCalculation {
    
    public static void testFloating() {
        double funds = 1.00;
        int itemsBought = 0;
        for (double price = .10; funds >= price; price += .10) {
            funds -= price;
            itemsBought++;
        }

        System.out.println(itemsBought + " items bought.");
        System.out.println("Change: $" + funds);
    }

    public static void testBigDecimal() {
        final BigDecimal TEN_CENTS = new BigDecimal(".10");

        int itemsBought = 0;
        BigDecimal funds = new BigDecimal("1.00");
        for (BigDecimal price = TEN_CENTS; 
             funds.compareTo(price) >= 0;
             price = price.add(TEN_CENTS)) {
            itemsBought++;
            funds = funds.subtract(price);
        }

        System.out.println(itemsBought + " items bought.");
        System.out.println("Money left over: $" + funds);
    }

    public static void testInt() {
        int itemsBought = 0;
        int funds = 100;
        for (int price = 10; funds >= price; price += 10) {
            itemsBought++;
            funds -= price;
        }

        System.out.println(itemsBought + " items bought.");
        System.out.println("Money left over: $" + funds + " cents");
    }

    public static void main(String[] args) {
        System.out.println("using floating point for monetary calculation");
        testFloating();

        System.out.println("using big decimal for monetary calculation");
        testBigDecimal();

        System.out.println("using int for monetary calculation");
        testInt();
    }
}
