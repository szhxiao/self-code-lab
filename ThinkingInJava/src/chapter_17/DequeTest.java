import java.util.Deque;

/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

public class DequeTest {
    static void fillTest(Deque<Integer> deque) {
        for (int i = 20; i < 27; i++) {
            deque.addFirst(i);
        }

        for (int i = 50; i < 55; i++) {
            deque.addLast(i);
        }

    }

    public static void main(String[] args) {
        Deque<Integer> di = new Deque<Integer>();
        fillTest(di);
        System.out.println(di);
        while (di.size() != 0) {
            System.out.print(di.removeFirst() + " ");
        }
        System.out.println();
        fillTest(di);
        while (di.size() != 0) {
            System.out.print(di.removeLast());
        }
    }
}