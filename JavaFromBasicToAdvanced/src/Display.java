
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 
 */
public class Display {
    private int value = 0;
    private int limit = 0;

    public Display(int limit) {
        this.limit = limit;
    }

    public void increase() {
        value++;
        if (value == limit) {
            value = 0;
        }
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Display d = new Display(24);
        for (;;) {
            d.increase();
            System.out.println(d.getValue());
        }
    }

}

/**
 * output:
 *
 */