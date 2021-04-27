/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This program demonstrates the random shuffle and sort algorithms.
 */
public class ShuffleTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 49; i++) {
            numbers.add(i);
        }
        // shuffle方法将元素复制到数组中
        // 然后打乱数组元素的顺序
        // 最后将打乱顺序后的元素复制回列表
        Collections.shuffle(numbers);
        // subList方法获得一个列表的子范围视图
        List<Integer> winningCombination = numbers.subList(0, 6);
        // 使用给定比较器对列表进行排序
        Collections.sort(winningCombination);
        System.out.println(winningCombination);
    }
}
