/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack<E> {
    private Object[] arr;   // 存储元素

    private int STACK_LENGTH = 4;   // 默认初始化容量
    private int size;   // 记录元素个数

    private int index = -1; // 操作数组下标位置索引
    
    public boolean isEmpty() {
        return size == 0;
    }

    public E pop() {
        // 若栈为空，抛出异常
        if (this.index == -1) {
            throw new EmptyStackException();
        }
        size--;
        // 返回栈顶元素
        return (E)arr[index--];
    }

    /**
     * 添加元素
     * 
     * @param item 添加元素
     * @return 元素值
     */
    public E push(E item) {
        // 初始化数组
        resize();
        // 添加元素
        arr[++index] = item;
        // 记录元素个数
        size++;
        return item;
    }

    /**
     * 初始化数组
     * 对数组进行扩容
     */
    private void resize() {
        // 数组初始化
        if (arr == null) {
            arr = new Object[STACK_LENGTH];
        }
        // 1.5倍扩容
        if (size - (STACK_LENGTH-1) >= 0) {
            STACK_LENGTH = STACK_LENGTH + (STACK_LENGTH >> 1);
            arr = Arrays.copyOf(arr, STACK_LENGTH);
        }
    }


    public static void main(String[] args) {
        MyStack<String> ms = new MyStack<>();
        ms.push("hello");
        ms.push("atom");
        ms.push("vscode");
        System.out.println(ms.size);
        System.out.println(ms.pop());
    }
}
