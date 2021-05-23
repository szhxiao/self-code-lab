/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 测试类
 */
public class Point {
    // 类属性
    private double x;
    private double y;

    // 构造方法
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // 类方法

    /**
     * 设置新坐标
     * @param x 横坐标
     */
    public void setX(double x) {
        this.x = x;
    }
    /**
     * 设置新坐标
     * @param y 纵坐标
     */
    public void setY(double y) {
        this.y = y;
    }

    public double getDistance(Point p) {
        return Math.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y-p.y));
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        // 创建对象
        Point p1 = new Point(3.0, 4.0);
        Point p2 = new Point(0.0, 0.0);
        System.out.println(p1.getDistance(p2));
    }
}

/**
 * output:
 * 
 */