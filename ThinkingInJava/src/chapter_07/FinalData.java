/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates the effect of final on fields
 */

import java.util.*;

class Value {
    // package access
    int i;

    public Value(int i) {
        this.i = i;
    }
}

public class FinalData {
    private static Random rand = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    private final int valueOne = 9;                 // 可编译常量
    private static final int VALUE_TWO = 99;        // 不可变常量
    public static final int VALUE_THREE = 39;       //
    private final int i4 = rand.nextInt(20);        // 不可变常量
    static final int INT_5 = rand.nextInt(20);

    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);

    private final int[] a = {1, 2, 3, 4, 5, 6};

    public String toString() {
        return id + ": " + " i4 = " + i4 + ". INT_5 = " + INT_5;
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");

        fd1.v2.i++;
        fd1.v1 = new Value(9);
        for(int i = 0; i < fd1.a.length; i++) {
            fd1.a[i] ++;
        }

        System.out.println(fd1);
        System.out.println("Creating new FinalData");
        
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }
}

/**
 * output:
 * fd1:  i4 = 15. INT_5 = 18
 * Creating new FinalData
 * fd1:  i4 = 15. INT_5 = 18
 * fd2:  i4 = 13. INT_5 = 18
*/
