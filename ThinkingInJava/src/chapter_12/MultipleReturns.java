/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 *
 */

public class MultipleReturns {
    public static void f(int i) {
        System.out.println("Initialization that requires cleanup");
        try {
            System.out.println("Point 1");
            if(i == 1) {
                return;
            }
            System.out.println("Point 2");
            if(i == 2) {
                return;
            }
            System.out.println("Point 3");
            if(i == 3) {
                return;
            }
            System.out.println("End");
            return;
        } finally {
            System.out.println("Performing cleanup");
        }
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++) {
            f(i);
        }
    }
}

/**
 * output:
 * Initialization that requires cleanup
 * Point 1
 * Performing cleanup
 * Initialization that requires cleanup
 * Point 1
 * Point 2
 * Performing cleanup
 * Initialization that requires cleanup
 * Point 1
 * Point 2
 * Point 3
 * Performing cleanup
 * Initialization that requires cleanup
 * Point 1
 * Point 2
 * Point 3
 * End
 * Performing cleanup
 */