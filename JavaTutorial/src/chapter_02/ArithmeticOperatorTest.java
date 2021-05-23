/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.math.BigDecimal;

/**
 * 测试算术运算符
 */
public class ArithmeticOperatorTest {
    public static void main(String[] args) {
        System.out.println("*****测试自增自减*****");

        int a = 3;
        System.out.println("a = " + a);
        System.out.println("a++ = " + a++);         // 先使用，再加1
        System.out.println("After a++, a = " + a);
        System.out.println("a-- = " + a--);         // 先使用，再减1
        System.out.println("After a--, a = " + a);

        System.out.println();

        int b = 4;
        System.out.println("b = " + b);
        System.out.println("++b = " + ++b);         // 先加1，再使用
        System.out.println("After ++b, b = " + b);
        System.out.println("--b = " + --b);         // 先减1，再使用
        System.out.println("After --b, b = " + b);

    }
}
/*
output:
*****测试自增自减*****
a = 3
a++ = 3
After a++, a = 4
a-- = 4
After a--, a = 3

b = 4
++b = 5
After ++b, b = 5
--b = 4
After --b, b = 4
 */