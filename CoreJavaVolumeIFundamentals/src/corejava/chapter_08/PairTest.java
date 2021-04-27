/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.time.LocalDate;

/**
 * This program demonstrates genericity.
 */
public class PairTest {
    public static void main(String[] args) {
        LocalDate[] birthdays = {
            LocalDate.of(1906, 12, 9),
            LocalDate.of(1815, 12, 10),
            LocalDate.of(1903, 12, 3),
            LocalDate.of(1910, 6, 2),
        };
        Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}


class ArrayAlg {
    public static class Pair<T> {
        private T first;
        private T second;

        public Pair() {
            first = null;
            second = null;
        }

        /**
         * Pair constructor
         * 
         * @param f the first number
         * @param s the second number
         */
        public Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }
        public T getSecond() {
            return second;
        }
    }

    /**
     * Gets the minimum and maximum of an array of objects of type T
     * 
     * @param  a an array of objects of type T
     * @return   a pair with the mim and max value, or null
     */
    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        if ((a == null) || (a.length == 0)) {
            return null;
        }
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) {
                min = a[i];
            }
            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }
        }
        return new Pair<>(min, max);
    }
}