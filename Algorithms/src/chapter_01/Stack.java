/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 *         Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<Item> implements Iterable<Item> {
    // top of stack
    private Node first;
    // size of stack
    private int N;

    /**
     * Helper linked list class
     */
    private class Node {
        Item item;
        Node next;
    }

    /**
     * Returns true if the stack is empty.
     * 
     * @return {@code true} if the stack is empty;
     *         {@code false} otherwise
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Returns the number of items in the stack.
     * 
     * @return the number of items in the stack
     */
    public int size() {
        return N;
    }

    /**
     * Adds item to the stack.
     * 
     * @param item the item to add
     */
    public void push(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    /**
     * Removes add returns the item most recently added to the stack.
     * 
     * @return the item most recently added
     */
    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
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
        private Node current;

        public LinkedIterator(Node first) {
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
     * Unit tests the {@code Stack} data type.
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        Stack<String> str = new Stack<>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                str.push(item);
            } else if (!str.isEmpty()) {
                System.out.print(str.pop() + " ");
            }
        }
        System.out.println("(" + str.size() + "left on stack)");
    }
}

/**
 * output:
 *
 */