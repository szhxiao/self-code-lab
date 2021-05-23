/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */


public class GenericMethod {
    
    public <T> void setName(T name) {
        System.out.println(name);
    }

    public <T> T getName(T name) {
        return name;
    }

    public <T> void method(T... args) {
        for (T t : args) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.setName("hello");
        gm.setName(3.1415);

        // GenericMethod gs = new GenericMethod();
        // String name = gs.getName("world");
        // System.out.println(name);

        String[] array = new String[] { "a", "b", "c" };
        gm.method(array);
    }
}

/**
 * output:
 * 
 * 
 */