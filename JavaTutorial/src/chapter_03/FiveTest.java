/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 循环输出1－1000之间能被5整除的数
 * 且每行输出3个
 */
public class FiveTest {

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {

        for (int i = 0, j = 0; i < 1000; i++) {
            // 判断是否能被5整除
            if (i % 5 == 0) {
                System.out.print(i + "\t");
                j++;
            }

            // 控制每行输出3个数
            if (j == 3) {
                System.out.println();
                j = 0;
            }
        }

        // int i = 0;
        // int j = 0;
        // while (i < 1000) {
        //     if (i % 5 == 0) {
        //         System.out.print(i + "\t");
        //         j++;
        //     }

        //     if (j == 3) {
        //         System.out.println();
        //         j = 0;
        //     }

        //     i++;
        // }
    }
}

/**
 * output:
 */