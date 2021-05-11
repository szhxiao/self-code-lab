/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */


public class TestParam {
    public final int size;
    public final int loops;

    /**
     * Init {@code TestParam}
     * 
     * @param size
     * @param loops
     */
    public TestParam(int size, int loops) {
        this.size = size;
        this.loops = loops;
    }

    /**
     * Creates an array of TestParam from a varargs sequence.
     * 
     * @param values
     * @return
     */
    public static TestParam[] array(int... values) {
        int size = values.length / 2;
        TestParam[] result = new TestParam[size];
        int n = 0;
        for (int i = 0; i < size; i++) {
            result[i] = new TestParam(values[n++], values[n++]);
        }
        return result;
    }

    /**
     * Converts a String array to a TestParam array.
     * 
     * @param values the String array to be converted
     * @return TestParam array
     */
    public static TestParam[] array(String[] values) {
        int[] vals = new int[values.length];
        for (int i = 0; i < vals.length; i++) {
            vals[i] = Integer.decode(values[i]);
        }
        return array(vals);
    }
}