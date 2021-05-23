/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        // 实例化ArrayList容器
        List<String> strList = new ArrayList<>();
        // 添加元素
        strList.add("hello");
        strList.add(1, "collection");
        strList.add("java");
        System.out.println(strList);
        System.out.println("-----------");

        // 通过指定索引获取元素
        System.out.println("strList.get(0) = " + strList.get(0));
        // 通过循环获取元素
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
        System.out.println("-----------");

        // size()
        System.out.println("strLit.size() = " + strList.size());
        System.out.println("-----------");

        // 根据索引删除元素
        String delStr = strList.remove(0);
        System.out.println("the item removed: " + delStr);
        System.out.println("-----------");

        // 替换元素
        strList.set(0, "script");
        System.out.println(strList);
        System.out.println("-----------");

        // 清空容器
        // strList.clear();
        // System.out.println(strList);
        // System.out.println("-----------");

        // 判断容器是否为空
        System.out.println("strList.isEmpty() = " + strList.isEmpty());
        System.out.println("-----------");

        // 判断容器是否包含指定元素
        System.out.println("contains(hello) = " + strList.contains("hello"));
        System.out.println("-----------");

        // 查找元素的位置（第一次出现）
        strList.add("python");
        int index = strList.indexOf("java");
        System.out.println("index(java) = " + index);

        // 查找元素的位置（最后一次出现），不存在时返回-1
        // strList.add("java");
        int lastIndex = strList.lastIndexOf("c");
        System.out.println("lastIndexOf(c) = " + lastIndex);
        System.out.println("-----------");

        // 将集合转换成数组
        Object[] strArr = strList.toArray();
        // for (Object str : strArr) {
        //     System.out.println(str);
        // }
        for (int i = 0; i < strArr.length; i++) {
            String str = (String) strArr[i];
            System.out.print(str + " ");
        }
        System.out.println();
        System.out.println("-----------");

        // 将集合转换为指定类型数组
        String[] strArr2 = strList.toArray(new String[strList.size()]);
        for (String str : strArr2) {
            System.out.println(str);
        }
        System.out.println("-----------");
    }
}
