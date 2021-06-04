/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 *         Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

public class FixedCapacityStack<Item> {
    private Item[] a;
    private int N;

    /**
     * Initializes a FixedCapacityStack
     * 
     * @param cap the capacity of the stack
     */
    public FixedCapacityStack(int cap) {
        a = (Item[]) new Object[cap];
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
    // public void push(Item item) {
    //     a[N++] = item;
    // }
    public void push(Item item) {
        if (N == a.length) {
            resize(2 * a.length);
        }
        a[N++] = item;
    }

    /**
     * Pops the item from the stack.
     * 
     * @return the item 
     */
    // public Item pop() {
    //     return a[--N];
    // }
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

    public static void main(String[] args) {
        FixedCapacityStack<String> s;
        s = new FixedCapacityStack<>(100);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                s.push(item);
            } else if (!s.isEmpty()) {
                System.out.print(s.pop() + " ");
            }
        }
        System.out.println("(" + s.size() + " left on stack)");
    }
}

/**
 * output:
 *
 */