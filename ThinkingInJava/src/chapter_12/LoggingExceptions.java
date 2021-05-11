/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates reporting exception through a Logger.
 */

import java.util.logging.*;
import java.io.*;

class LoggingException extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");

    public LoggingException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class LoggingExceptions {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch(LoggingException e) {
            System.err.println("Caught " + e);
        }

        try {
            throw new LoggingException();
        } catch(LoggingException e) {
            System.out.println("Caught " + e);
        }
    }
}

/**
 * output:
 * 6月 07, 2020 4:37:23 下午 LoggingException <init>
 * 严重: LoggingException
 * 	at LoggingExceptions.main(LoggingExceptions.java:34)
 * 
 * Caught LoggingException
 * 6月 07, 2020 4:37:23 下午 LoggingException <init>
 * 严重: LoggingException
 * 	at LoggingExceptions.main(LoggingExceptions.java:40)
 * 
 * Caught LoggingException
 */
