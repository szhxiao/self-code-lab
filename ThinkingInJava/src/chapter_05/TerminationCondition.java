/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates using {@code finalize()}
 * to detect an object that hasn't been properly cleaned up.
 */

class Book {
    boolean checkedOut = false;

    Book(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    protected void finalize() {
        if (checkedOut) {
            System.out.println("Error: checked out");
        }
    }
}

public class TerminationCondition {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Book novel = new Book(true);
        // Proper cleanup
        novel.checkIn();
        // Drop the reference, forget to clean up
        new Book(true);
        // Force garbage collection & finalization
        System.gc();
    }
}

/*
output:
Error: checked out
 */