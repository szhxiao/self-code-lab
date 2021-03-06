/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates each disposable object
 * must be followed by a try-finally.
 */

class NeedsCleanup {
    private static long counter = 1;
    private final long id = counter++;
    
    public void dispose() {
        System.out.println("NeedsCleanup " + id + " disposed");
    }
}

class ConstructionException extends Exception {}

class NeedsCleanup2 extends NeedsCleanup {
    public NeedsCleanup2() throws ConstructionException {}
}

public class CleanupIdiom {

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        NeedsCleanup nc1 = new NeedsCleanup();
        try {

        } finally {
            nc1.dispose();
        }

        NeedsCleanup nc2 = new NeedsCleanup();
        NeedsCleanup nc3 = new NeedsCleanup();
        try {

        } finally {
            nc3.dispose();
            nc2.dispose();
        }

        try {
            NeedsCleanup2 nc4 = new NeedsCleanup2();
            try {
                NeedsCleanup2 nc5 = new NeedsCleanup2();
                try {

                } finally {
                    nc5.dispose();
                }
            } catch (ConstructionException e) {
                System.out.println(e);
            } finally {
                nc4.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/**
 * output:
 * NeedsCleanup 1 disposed
 * NeedsCleanup 3 disposed
 * NeedsCleanup 2 disposed
 * NeedsCleanup 5 disposed
 * NeedsCleanup 4 disposed
 */