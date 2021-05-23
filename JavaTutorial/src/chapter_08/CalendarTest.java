
/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 测试Calendar类
 */

public class CalendarTest {

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar(2999, 10, 9, 22, 10, 19);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONDAY);
        int day = calendar.get(Calendar.DATE);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(dayOfMonth);
        System.out.println(dayOfWeek);
    }
}

/**
 * output:
 * 
 */