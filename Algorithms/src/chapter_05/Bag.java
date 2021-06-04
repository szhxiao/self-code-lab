/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 * @author Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<Item> implements Iterable<Item> {
    // beginning of bag
    private Node<Item> first;
    // number of elements in bag
    private int n;

    /**
     * Class Node
     * @param <Item>
     */
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    /**
     * Initializes an empty bag.
     */
    public Bag() {
        first = null;
        n = 0;
    }

    /**
     * Returns true if bag is empty.
     * 
     * @return {@code true} if bag is empty;
     *         {@code false} otherwise
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Returns the number of items in the bag.
     * 
     * @return the number of items in the bag
     */
    public int size() {
        return n;
    }

    /**
     * Adds the item to this bag.
     * 
     * @param item the item to add to this bag
     */
    public void add(Item item) {
        Node<Item> oldFirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldFirst;
        n++;
    }

    /**
     * Returns an iterator that iterates over the items in this bag
     * in arbitrary order.
     * 
     * @return an iterator that iterates over the items in this bag 
     *         in arbitrary order
     */
    public Iterator<Item> iterator() {
        return new LinkedIterator(first);
    }

    /**
     * An iterator
     */
    private class LinkedIterator implements Iterator<Item> {
        private Node<Item> current;

        public LinkedIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    /**
     * Unit test the {@code Bag} data type.
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        Bag<String> bag = new Bag<>();
        // Scanner in = new Scanner(System.in);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            bag.add(item);
        }

        System.out.println("Size of bag = " + bag.size());
        for (String str : bag) {
            System.out.println(str);
        }
    }
}

/**
 * output:
 * Press Ctrl + D to quit input
 */