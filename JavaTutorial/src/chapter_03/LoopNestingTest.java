/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.Scanner;
/**
 * 测试for循环结构
 */
public class LoopNestingTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
/*
output:

 */