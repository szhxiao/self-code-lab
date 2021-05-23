/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 打印100以内能被3整除的数，每行打印5个
 */
public class ContinueTest {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i < 100; i++) {
            // 判断能否被3整除
            if (i % 3 == 0) {
                continue;
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