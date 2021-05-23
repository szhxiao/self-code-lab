import java.util.Random;

/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 测试Enum类
 */

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

enum Week {
    星期一, 星期二, 星期三, 星期四, 星期五, 星期六, 星期天
}

public class EnumTest {

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);

        // 枚举遍历
        for (Week k : Week.values()) {
            System.out.print(k + " ");
        }
        System.out.println();

        int a = new Random().nextInt(4); // 0, 1, 2, 3, 4

        // 枚举与switch语句
        switch (Season.values()[a]) {
        case SPRING:
            System.out.println("春天");
            break;
        case SUMMER:
            System.out.println("夏天");
            break;
        case AUTUMN:
            System.out.println("秋天");
            break;
        case WINTER:
            System.out.println("冬天");
            break;

        }
    }
}

/**
 * output:
 * 
 */