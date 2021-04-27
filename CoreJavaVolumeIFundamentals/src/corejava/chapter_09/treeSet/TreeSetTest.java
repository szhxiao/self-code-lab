/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * This program sorts a set of item by comparing their descriptions.
 */
public class TreeSetTest {
    public static void main(String[] args) {
        
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 4562));
        parts.add(new Item("Modem", 9912));

        // sort a set of item by comparing their descriptions
        NavigableSet<Item> sortByDescription = new TreeSet<>(
            Comparator.comparing(Item::getDescription));

        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
    }
}

/*
output:
[[ description = Modem, partNumber = 9912 ],
[ description = Toaster, partNumber = 1234 ], 
[ description = Widget, partNumber = 4562 ]]
*/