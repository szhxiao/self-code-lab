/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.Scanner;
import java.util.regex.MatchResult;

/**
 *
 */
public class ThreatAnalyzer {
    static String threatData = 
        "58.27.82.161@02/10/2005\n" + 
        "204.45.234.40@02/11/2005\n" + 
        "[Next log section with different data format]";
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(threatData);
        String pattern = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@"
            + "(\\d{2}/\\d{2}/\\d{4})";
        while (scanner.hasNext(pattern)) {
            scanner.next(pattern);
            MatchResult match = scanner.match();
            String ip = match.group(1);
            String date = match.group(2);
            System.out.format("Threat on %s from %s\n", date, ip);
        }
    }
}

/**
 * output:
 * Threat on 02/10/2005 from 58.27.82.161
 * Threat on 02/11/2005 from 204.45.234.40
 */