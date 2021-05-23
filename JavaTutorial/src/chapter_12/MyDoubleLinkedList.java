/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

public class MyDoubleLinkedList<E> implements MyList<E> {

    class Node<E> {
        E item;
        Node<E> prev;
        Node<E> next;

        Node(E item, Node<E> prev, Node<E> next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;
    
    /**
     * 添加元素
     * @param element
     */
    public void add(E element) {
        linkLast(element);
    }

    /**
     * 向双链表头添加元素
     * @param element
     */
    public void addFirst(E element) {
        linkFirst(element);
    }

    /**
     * 向双链表尾添加元素
     * @param element
     */
    public void addLast(E element) {
        linkLast(element);
    }

    private void linkFirst(E element) {
        // 获取头结点对象
        Node<E> temp = head;
        // 创建新结点
        Node<E> node = new Node(element, null, temp);
        // 将新结点定义为头结点
        head = node;
        if (temp == null) {
            tail = node;
        } else {
            temp.prev = node;
        }
        // 更新元素个数
        size++;
    }
    
    private void linkLast(E element) {
        // 获取尾结点
        Node temp = tail;
        // 创建结点
        Node<E> node = new Node(element, tail, null);
        // 将新结点定义为尾结点
        tail = node;

        if (temp == null) {
            head = node;
        } else {
            temp.next = node;
        }
        size++;
    }

    /**
     * 获取元素
     * @param index
     * @return
     */
    public E get(int index) {
        checkIndex(index);
        // 根据位置查找结点
        Node<E> node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        checkIndex(index);
        Node<E> temp;
        // 判断当前位置与头、尾的距离
        if (index < size >> 1) {
            temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = size - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    /**
     * 元素个数
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
        checkIndex(index);
        // 根据位置获取结点
        Node<E> node = getNode(index);
        // 获取结点中的元素
        E item = node.item;
        // 判断结点是否为头结点
        if (node.prev == null) {
            head = node.next;
        } else {
            node.prev.next = node.next;
        }

        // 判断结点是否为尾结点
        if (node.next == null) {
            tail = node.prev;
        } else {
            node.next.prev = node.prev;
        }
        
        node.prev = null;
        node.next = null;
        node.item = null;

        size--;
        return item;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + " is invalid");
        }
    }

    public static void main(String[] args) {
        MyList<String> list = new MyDoubleLinkedList<>();
        list.add("hello");
        list.add("java");
        list.add("javascript");
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Removed item: " + list.remove(2));

        System.out.println("------------------------");
        
        MyDoubleLinkedList<String> ml = new MyDoubleLinkedList<>();
        ml.add("atom");
        ml.addFirst("vim");
        ml.addLast("emacs");
        ml.addFirst("vscode");
        for (int i = 0; i < ml.size(); i++) {
            System.out.println(ml.get(i));
        }
    }
}
