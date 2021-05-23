/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.Date;


public class Generic<T> {
    private T flag;

    public void setFlag(T flag) {
        this.flag = flag;
    }

    public T getFlag() {
        return this.flag;
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Generic<String> gs = new Generic<>();
        gs.setFlag("hello world");
        System.out.println(gs.getFlag());

        Generic<Integer> gi = new Generic<>();
        gi.setFlag(100);
        System.out.println(gi.getFlag());
    }
}

/**
 * output:
 * 
 * 
 */