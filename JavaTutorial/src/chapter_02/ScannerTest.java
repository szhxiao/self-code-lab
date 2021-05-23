/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.Scanner;
/**
 * 测试获取键盘输入
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your name: ");
        String name = input.nextLine();
        System.out.println("Please input your interests: ");
        String interest = input.nextLine();
        System.out.println("Please intput your age: ");
        int age = input.nextInt();

        System.out.println("*****Scanner Test*****");
        System.out.println("Hello, " + name + ", you are " + age + " years old");
        System.out.println("He/Her likes " + interest);

    }
}
/*
output:

 */