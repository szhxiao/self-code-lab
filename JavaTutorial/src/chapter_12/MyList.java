/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 基于链表结构的API
 */
public interface MyList<E> {
    void add(E element);

    E get(int index);

    int size();

    E remove(int index);
}
