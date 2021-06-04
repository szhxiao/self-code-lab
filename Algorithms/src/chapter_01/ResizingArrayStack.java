/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 *         Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable {
    private Item[] a = (Item[]) new Object();
    private int N = 0;
    
    /**
     * Returns true if the stack is empty.
     * 
     * @return {@code true} if the stack is empty;
     *         {@code false} otherwise
     */
    public boolean isEmpty() {
        return N == 0;
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
        if (N == a.length) {
            resize(2 * a.length);
        }
        a[N++] = item;
    }

    /**
     * Removes and returns the item from the stack.
     * 
     * @return the item 
     */
    public Item pop() {
        Item item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4) {
            resize(a.length / 2);
        }
        return item;
    }
    
    /**
     * Resize array to a new size.
     * 
     * @param max the new size of array
     */
    private void resize(int max) {
        Item[] temp = (Item[]) new Object();
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }
    
    /**
     * 
     */
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;

        public boolean hasNext() {
            return i > 0;
        }

        public Item next() {
            return a[--i];
        }

        public void remove() {
        }
    }

    public static void main(String[] args) {
        
    }
}

/**
 * output:
 *
 */