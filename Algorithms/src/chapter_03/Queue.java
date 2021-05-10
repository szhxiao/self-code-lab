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

public class Queue<Item> implements Iterable<Item> {
    // head of queue
    private Node first;
    // tail of queue
    private Node last;
    // size of queue
    private int N;

    /**
     * Helper linked list class
     */
    private class Node {
        Item item;
        Node next;
    }

    /**
     * Returns true if the queue is empty.
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
     * Adds item to the queue.
     * 
     * @param item the item to add
     */
    public void enqueue(Item item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldlast.next = last;
        }
        N++;
    }

    /**
     * Removes add returns the item.
     * 
     * @return the item 
     */
    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
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
        Queue<String> queue = new Queue<>();

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                queue.enqueue(item);
            } else if (!queue.isEmpty()) {
                System.out.print(queue.dequeue() + " ");
            }
        }
        System.out.println("(" + queue.size() + " left on queue)");
    }
}

/**
 * output:
 *
 */