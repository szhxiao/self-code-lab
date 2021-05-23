/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        // 实例化栈
        Stack<String> s = new Stack<>();

        // 元素入栈
        s.push("java");
        s.push("javascript");
        s.push("python");

        // 元素在栈中的位置
        System.out.println("java's location is: " + s.search("java"));

        // 元素出栈
        System.out.println(s.pop());
        System.out.println(s.pop());

        // 判断栈是否为空
        System.out.println("isEmpty() = " + s.isEmpty());

        // 查看栈顶元素
        System.out.println(s.peek());

        System.out.println("-----------------");

        symmetry();

    }

    public static void symmetry() {
        String str = "..{....[.....(....)...]...}...(...)";
        Stack<String> stack = new Stack<>();

        boolean flag = true;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '{') {
                stack.push("}");
            }
            if (c == '[') {
                stack.push("]");
            }
            if (c == '(') {
                stack.push(")");
            }

            // 判断是否匹配
            if (c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty()) {
                    flag = false;
                    break;
                }
                String s = stack.pop();
                if (s.charAt(0) != c) {
                    flag = false;
                    break;
                }
            }
        }
        if (!stack.isEmpty()) {
            flag = false;
        }

        System.out.println(flag);
    }
}
