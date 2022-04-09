/**
 * Effective Java
 * 
 * @version 2nd
 * @author Joshua Bloch
 * @see 
 */


import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 */
public class Person {
    private final Date birthDate;

    // DON'T DO THIS!
    /*
    public boolean isBabyBoomer() {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomStart = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomEnd = gmtCal.getTime();
        return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;
    }
     */

    private static final Date BOOM_START;
    private static final Date BOOM_END;

    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomStart = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomEnd = gmtCal.getTime();
    }

    public boolean isBabyBoomer() {
        return birthDate.compareTo(BOOM_START) >= 0 && birthDate.compareTo(BOOM_END) < 0;
    }

}