/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 打印乘法表
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            // 输出一行
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + " = " + j*i + "\t");
            }
            System.out.println();
        }
    }
}
/*
output:

 */