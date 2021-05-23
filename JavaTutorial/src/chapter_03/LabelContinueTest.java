/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 打印100以内能被的质数，每行打印5个
 */
public class LabelContinueTest {
    public static void main(String[] args) {
        int counter = 0;
        outer:for (int i = 1; i < 100; i++) {
            // 遍历排除非质数
            for (int j = 2; j < i/2; j++) {
                if (i % j == 0) {
                    continue outer;
                }
            }
            System.out.print(i + "\t");
            
            counter++;
            // 控制每行输出
            if (counter % 5 == 0) {
                System.out.println();
            }
        }
        
    }
}
/*
output:

 */