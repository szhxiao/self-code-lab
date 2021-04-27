/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * This program demonstrates the use of a priority queue.
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        // constructs a priority queue and add elements
        PriorityQueue<LocalDate> pq = new PriorityQueue<>();
        pq.add(LocalDate.of(1906, 12, 9));
        pq.add(LocalDate.of(1815, 12, 10));
        pq.add(LocalDate.of(1903, 12, 3));
        pq.add(LocalDate.of(1910, 6, 22));

        // iterate over elements
        System.out.println("Interating over elements...");
        for (LocalDate date : pq) {
            System.out.println(date);
        }

        // remove elements
        System.out.println("Removing elements...");
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}

/**
output:
Interating over elements...
1815-12-10
1906-12-09
1903-12-03
1910-06-22
Removing elements...
1815-12-10
1903-12-03
1906-12-09
1910-06-22
 */