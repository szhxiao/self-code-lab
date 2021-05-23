/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

public class MySingleLinkedList<E> implements MyList<E> {

    class Node<E> {
        private E item; // 存储元素
        private Node next; // 存储下一个节点对象地址

        Node(E item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    private Node head; // 头结点
    private int size;

    /**
     * 添加元素
     * @param element
     */
    public void add(E element) {
        // 创建节点
        Node<E> node = new Node<>(element, null);
        // 找到尾结点
        Node tail = getTail();
        // 结点连接
        if (tail == null) {
            head = node;
        } else {
            tail.next = node;
        }
        size++;
    }
    
    private Node getTail() {
        // 头结点是否存在
        if (head == null) {
            return null;
        }
        
        Node<E> tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp;
    }

    /**
     * 获取元素
     */
    public E get(int index) {
        // 校验index
        checkIndex(index);
        // 根据位置获取指定节点
        Node<E> node = getNode(index);
        // 返回节点元素
        return node.item;
    }
    
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + "is not valid");
        }
    }
    
    private Node getNode(int index) {
        Node<E> tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }

    /**
     * 获取元素个数
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * 删除元素
     * @param index
     * @return
     */
    public E remove(int index) {
        // 检查index合法性
        checkIndex(index);
        // 根据位置找到结点对象
        Node<E> tmp = getNode(index);
        // 获取结点对象元素
        E item = tmp.item;
        // 删除结点
        if (tmp == head) {
            head = tmp.next;
        } else {
            Node<E> pre = getNode(index - 1);
            pre.next = tmp.next;
        }
        tmp.next = null;
        // 更新元素个数
        size--;
        // 返回元素
        return item;
    }

    public static void main(String[] args) {
        MySingleLinkedList<String> list = new MySingleLinkedList<>();
        list.add("hello");
        list.add("atom habits");
        list.add("educated");
        System.out.println(list.size());
        System.out.println("Remove item(0): " + list.remove(0));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
