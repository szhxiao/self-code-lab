/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 测试switch选择结构
 */
public class SwitchTest {
    public static void main(String[] args) {
        int month =(int)(1 + 12 * Math.random());
        System.out.println("Month: " + month);
        switch (month) {
            case 1:
                System.out.println("Happy New Year");
                break;
            case 2:
                System.out.println("Happy Spring Festival");
                break;
            case 3:
                System.out.println("Tomb-sweeping Day");
            default:
                System.out.println("Others");
                break;
        }
    }
}
/*
output:

 */