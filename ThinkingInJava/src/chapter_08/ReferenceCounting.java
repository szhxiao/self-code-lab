/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates cleaning up shared member objects.
 */

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            System.out.println("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }
}

public class ReferenceCounting {
    

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
            new Composing(shared)
        };
        for (Composing composing : composings) {
            composing.dispose();
        }
    }
}

/**
 * output:
 * Creating Shared 0
 * Creating Composing 0
 * Creating Composing 1
 * Creating Composing 2
 * Creating Composing 3
 * Creating Composing 4
 * disposing Composing 0
 * disposing Composing 1
 * disposing Composing 2
 * disposing Composing 3
 * disposing Composing 4
 * Disposing Shared 0
 */