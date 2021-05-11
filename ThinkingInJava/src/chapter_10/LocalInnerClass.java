/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */


/**
 * This program demonstrates holding a sequence of Objects.
 */

interface Counter {
    int next();
}

public class LocalInnerClass {
    
    private int count = 0;

    Counter getCounter(final String name) {
        class LocalCounter implements Counter {
            public LocalCounter() {
                System.out.println("LocalCounter");
            }

            public int next() {
                System.out.print(name);
                return count++;
            }
        }
        return new LocalCounter();
    }

    Counter getCounter2(final String name) {
        return new Counter() {
            {
                System.out.println("Counter()");
            }

            public int next() {
                System.out.print(name);
                return count++;
            }
        };
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter c1 = lic.getCounter("Local inner ");
        Counter c2 = lic.getCounter2("Anonymous inner ");
        for (int i = 0; i < 5; i++) {
            System.out.println(c1.next());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(c2.next());
        }
    }
}

/**
 * output:
 * LocalCounter
 * Counter()
 * Local inner 0
 * Local inner 1
 * Local inner 2
 * Local inner 3
 * Local inner 4
 * Anonymous inner 5
 * Anonymous inner 6
 * Anonymous inner 7
 * Anonymous inner 8
 * Anonymous inner 9
 */
