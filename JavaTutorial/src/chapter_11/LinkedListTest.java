/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        // 添加元素
        list.add("linux");
        list.add("red hat");
        list.add("arch");

        // 获取元素
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        System.out.println("**************");

        LinkedList<String> linkedList = new LinkedList<>();
        // addFirst
        linkedList.add("just for fun");
        linkedList.addFirst("atomic habits");
        linkedList.add(1, "of human bondage");

        for (String s : linkedList) {
            System.out.println(s);
        }
        System.out.println("---------------");
        // addLast
        linkedList.addLast("educated");
        linkedList.addLast("wild");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        
        System.out.println("---------------");
        // getFirst
        System.out.println("first item is: " + linkedList.getFirst());
        // getLast
        System.out.println("last item is: " + linkedList.getLast());
    }
}
