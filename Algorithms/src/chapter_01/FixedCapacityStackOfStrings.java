/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 *         Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

public class FixedCapacityStackOfStrings {
    private String[] a;
    private int N;

    /**
     * Initializes a FixedCapacityStackOfStrings
     * 
     * @param cap the capacity of the stack
     */
    public FixedCapacityStackOfStrings(int cap) {
        a = new String[cap];
    }

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
     * Pushs the item to the stack.
     * 
     * @param item the item to add to the stack
     */
    public void push(String item) {
        a[N++] = item;
    }

    /**
     * Pops the item from the stack.
     * 
     * @return the item 
     */
    public String pop() {
        return a[--N];
    }
    public static void main(String[] args) {
        FixedCapacityStackOfStrings s;
        s = new FixedCapacityStackOfStrings(100);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                s.push(item);
            } else if (!s.isEmpty()) {
                System.out.print(s.pop() + " ");
            }
        }
        System.out.println("(" + s.size() + " left on stack).");
    }
}

/**
 * output:
 *
 */