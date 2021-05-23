/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.Arrays;

/**
 * 测试二分法查找
 */

public class BinarySearchTest {
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        int[] values = {30, 20, 50, 10, 80, 9, 7, 12, 100, 40, 8};
        Arrays.sort(values);

        System.out.println(Arrays.toString(values));
        System.out.println(BinarySearch(values, 100));

        
    }

    public static int BinarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (value == array[mid]) {
                return mid;
            }

            if (value > array[mid]) {
                low = mid + 1;
            }

            if (value < array[mid]) {
                high = mid - 1;
            }
        }
        return -1;
    }
}

