/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 测试if选择结构
 */
public class IfTest {
    public static void main(String[] args) {
        double d = Math.random();
        System.out.println(d);

        System.out.println("*****test if*****");
        int i = (int)(10 * Math.random());
        if (i < 3) {
            System.out.println("随机押小");
        }

        System.out.println("\n*****test if-else*****");
        double r = 10 * Math.random();
        double area = Math.PI * Math.pow(r, 2);
        double circle = 2 * Math.PI * r;
        System.out.println("半径为" + r + "的圆，其周长为" + circle + "，面积为" + area);
        if (area > circle) {
            System.out.println("周长小于面积");
        } else {
            System.out.println("周长大于面积");
        }
    }
}
/*
output:

 */