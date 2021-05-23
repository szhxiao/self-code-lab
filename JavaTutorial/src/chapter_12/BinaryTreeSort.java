/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 基于二叉树实现元素排序处理
 */
public class BinaryTreeSort<E extends Integer> {

    class Node<E extends Integer> {
        private E item;
        private Node left;
        private Node right;

        public Node(E item) {
            this.item = item;
        }

        /**
         * 添加结点
         * @param element
         */
        public void addNode(Node node) {
            // 新结点中元素与当前结点元素大小判断
            // 小于，置于左子树；大于，置于右子树
            if (node.item.intValue() < item.intValue()) {
                if (left == null) {
                    left = node;
                } else {
                    left.addNode(node);
                }
            } else {
                if (right == null) {
                    right = node;
                } else {
                    right.addNode(node);
                }
            }
        }

        /**
         * 中序遍历二叉树
         */
        public void inorderTraversal() {
            // 找到最左侧结点
            if (left != null) {
                left.inorderTraversal();
            }
            System.out.print(item + " ");
            if (right != null) {
                right.inorderTraversal();
            }
        }
    }

    private Node root;  // 树根结点

    /**
     * 将元素添加到排序器
     */
    public void add(E element) {
        // 实例化结点
        Node<E> node = new Node(element);
        // 判断当前二叉树是否有根结点
        if (root == null) {
            root = node;
        } else {
            root.addNode(node);
        }
    }
    
    /**
     * 对元素进行排序
     */
    public void sort() {
        // 判断根结点是否为空
        if (root == null) {
            return;
        }
        root.inorderTraversal();
    }

    public static void main(String[] args) {
        BinaryTreeSort<Integer> bts = new BinaryTreeSort<>();
        bts.add(1);
        bts.add(8);
        bts.add(6);
        bts.add(3);
        bts.add(5);
        bts.add(2);

        bts.sort();
        System.out.println();
    }
}