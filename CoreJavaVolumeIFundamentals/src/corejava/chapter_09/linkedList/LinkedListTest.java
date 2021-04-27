/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * This program demonstrates operations on linked list.
 */
public class LinkedListTest {
    public static void main(String[] args) {
        
        List<String> a = new LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");
        System.out.println(a);

        List<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");
        System.out.println(b);

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        // merge the words from b to a
        while (bIter.hasNext()) {
            if (aIter.hasNext()) {
                aIter.next();
            }
            aIter.add(bIter.next());
        }

        System.out.println(a);

        // remove every second word from b
        bIter = b.iterator();
        while (bIter.hasNext()) {
            // skip one element
            bIter.next();
            if (bIter.hasNext()) {
                // skip next element
                bIter.next();
                // remove the element
                bIter.remove();
            }
        }

        System.out.println(b);

        // remove all words in b from a
        a.removeAll(b);

        System.out.println(a);
    }
}

/*
output:
[Amy, Carl, Erica]
[Bob, Doug, Frances, Gloria]
[Amy, Bob, Carl, Doug, Erica, Frances, Gloria]
[Bob, Frances]
[Amy, Carl, Doug, Erica, Gloria]
 */