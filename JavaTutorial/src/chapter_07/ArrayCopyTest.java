/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 测试数组拷贝
 */

public class ArrayCopyTest {
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        String[] strings1 = {"aa", "bb", "cc", "dd"};
        String[] strings2 = new String[10];

        System.out.println("****arraycopy****");
        System.arraycopy(strings1, 2, strings2, 6, 2 );

        for (int i = 0; i < strings2.length; i++) {
            System.out.println(i + "-->" + strings2[i]);
        }

        System.out.println("****remove element****");
        removeElement(strings1, 0);

        System.out.println("****save element****");
        saveElement(strings1, 4, "zz");
    }

    public static String[] removeElement(String[] str, int index) {
        System.arraycopy(str, index+1, str, index, str.length-index-1);
        str[str.length-1] = null;
        for (int i = 0; i < str.length; i++) {
            System.out.println(i + "-->" + str[i]);
        }
        
        return str;
    }

    public static String[] saveElement(String[] str, int index, String element) {
        String[] dest = new String[str.length + 1];

        System.arraycopy(str, 0, dest, 0, index);
        dest[index] = element;
        System.arraycopy(str, index, dest, index+1, str.length-index);
        str = null;

        for (int i = 0; i < dest.length; i++) {
            System.out.println(i + "-->" + dest[i]);
        }
        
        return dest;
    }
}

