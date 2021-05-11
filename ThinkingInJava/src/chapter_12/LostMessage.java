/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates losting exception.
 */

class VeryImportantException extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                lm.dispose();
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

/**
 * output:
 * A trivial exception
 */