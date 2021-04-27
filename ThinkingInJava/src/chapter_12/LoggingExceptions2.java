/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates Logging caught exceptions.
 */

import java.util.logging.*;
import java.io.*;

public class LoggingExceptions2 {
    private static Logger logger = Logger.getLogger("LoggingExceptions2");

    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch(NullPointerException e) {
            logException(e);
        }
    }
}

/**
 * output:
 * 6月 07, 2020 4:48:14 下午 LoggingExceptions2 logException
 * 严重: java.lang.NullPointerException
 * 	at LoggingExceptions2.main(LoggingExceptions2.java:32)
 */
