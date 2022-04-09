/**
 * Effective Java
 *
 * @version 2nd
 * @author Joshua Bloch
 * @see http://java.sun.com/docs/books/effective
 */

import java.util.HashMap;
import java.util.Map;

public class PhoneNumber {
    private volatile int hashCode;

    private final short areaCode;
    private final short prefix;
    private short lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        rangeCheck(areaCode, 999, "area code");
        rangeCheck(prefix, 999, "prefix");
        rangeCheck(lineNumber, 9999, "line number");

        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PhoneNumber)) {
            return false;
        }
        PhoneNumber pn = (PhoneNumber) o;
        return pn.lineNumber == lineNumber && pn.prefix == prefix && pn.areaCode == areaCode;
    }

    // 1st hashCode()
    // @Override
    // public int hashCode() {
    //     int result = 17;
    //     result = 31 * result + areaCode;
    //     result = 31 * result + prefix;
    //     result = 31 * result + lineNumber;
    //     return result;
    // }

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = 17;
            result = 31 * result + areaCode;
            result = 31 * result + prefix;
            result = 31 * result + lineNumber;
            hashCode = result;
        }
        return result;
    }

    private static void rangeCheck(int arg, int max, String name) {
        if (arg < 0 || arg > max) {
            throw new IllegalArgumentException(name + ": " + arg);
        }
    }

    public static void main(String[] args) {
        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(new PhoneNumber(707, 867, 5309), "Jenny");
        // get null if there is no hashCode()
        System.out.println(m.get(new PhoneNumber(707, 867, 5309)));
    }
}
