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
public class ForTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a integer: ");
        int num = input.nextInt();

        int mul = 1 ;
        for (int i = num; i > 0; i--) {
            mul *= i;
        }
        System.out.println( num + "! = " + mul);
    }
}
/*
output:

 */