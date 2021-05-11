
/**
 * Author: Bruce Eckel 
 * Thinking in Java
 * @version 4.0 
 */

/**
 * making a stack from a LinkedList
 */

import java.util.*;

public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    public void push<T v> {
        storage.addFirst(v);
    } 

    public T peek() {
        return storage.getFirst();
    }

    public T pop() {
        return storage.removeFirst();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public String toString() {
        return storage.toString();
    }
    public static void main(String[] args) {

    }
}

/*
output:

*/
