/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

public class NonEnum {
    public static void main(String[] args) {
        Class<Integer> intClass = Integer.class;
        try {
            for (Object en : intClass.getEnumConstants()) {
                System.out.println(en);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/**
 * output:
 * java.lang.NullPointerException
 */