/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.math.BigDecimal;

public class PrimitiveDataTypeTest {
    public static void main(String[] args) {
        System.out.println("*****float and double*****");
        float a = 3.14F;
        double b = 6.28;
        double c = 628E-2;
        System.out.println(c);
        System.out.println((b/2)==a);


        System.out.println("*****BigDecimal*****");
        // 使用精确浮点运行
        BigDecimal bd = BigDecimal.valueOf(0.1);
        System.out.println(bd.equals(1.0/10));
        bd = bd.add(BigDecimal.valueOf(0.1));
        bd = bd.add(BigDecimal.valueOf(0.1));
        System.out.println(bd);
        System.out.println(0.1+0.1+0.1);
    }
}
/*
output:
*****float and double*****
6.28
false
*****BigDecimal*****
false
0.3
0.30000000000000004
 */