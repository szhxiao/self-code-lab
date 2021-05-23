/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 基于树形结构实现容器类
 */
public class MyTree<E> {
    private Map<E, E> map = new HashMap<>(); // string --> string
    private Map<E, List<E>> lmap = new HashMap<>(); // string --> list
    

    /**
     * 向容器中添加元素
     */
    public void add(E parent, E item) {
        // 完成树中单结点映射
        map.put(item, parent);
        // 完成多结点的映射
        List<E> list = lmap.get(parent);
        if (list == null) {
            list = new ArrayList<>();
            lmap.put(parent, list);
        }
        list.add(item);
    }

    /**
     * 获取当前结点的父结点
     */
    public E getParent(E item) {
        return map.get(item);
    }

    /**
     * 获取当前结点的子结点
     */
    public List<E> getChildren(E item) {
        return lmap.get(item);
    }

    /**
     * 获取当前结点的兄弟结点
     */
    public List<E> getBrothers(E item) {
        // 获取当前结点的父结点
        E parent = getParent(item);
        // 获取当前父结点的所有子结点
        List<E> list = getChildren(parent);
        List<E> brothers = new ArrayList<>();
        if (list != null) {
            brothers.addAll(list);
            brothers.remove(item);
        }
        return brothers;
    }

    /**
     * 获取当前结点的祖先结点
     */
    public List<E> getForefathers(E item) {
        // 获取当前结点的父结点
        E parent = getParent(item);
        if (parent == null) {
            return new ArrayList<>();
        }
        // 递归调用，获取结点父结点的父结点
        List<E> forefathers = getForefathers(parent);
        forefathers.add(parent);
        return forefathers;
    }

    /**
     * 获取当前结点的子孙结点
     */
    public List<E> getGrandChildren(E item) {
        // 存放所有子孙结点中的元素
        List<E> list = new ArrayList<>();
        // 获取当前结点的子结点
        List<E> children = getChildren(item);
        if (children == null) {
            return list;
        }
        // 遍历子结点
        for (int i = 0; i < children.size(); i++) {
            // 获取结点中的元素
            E element = children.get(i);
            List<E> temp = this.getGrandChildren(element);
            list.add(element);
            list.addAll(temp);
        }
        return list;
    }

    public static void main(String[] args) {
        MyTree<String> mt = new MyTree<>();
        mt.add("root", "生物");
        mt.add("生物", "植物");
        mt.add("生物", "动物");
        mt.add("动物", "脊椎动物");
        mt.add("动物", "脊索动物");
        mt.add("动物", "腔肠动物");
        mt.add("脊椎动物", "哺乳动物");
        mt.add("脊椎动物", "鱼类");
        mt.add("哺乳动物", "猫");
        mt.add("哺乳动物", "牛");
        mt.add("哺乳动物", "人");

        System.out.println("\n------ 获取父结点 --------");
        String parent = mt.getParent("鱼类");
        System.out.println(parent);

        System.out.println("\n----- 获取子结点 -----");
        List<String> children = mt.getChildren("动物");
        for (int i = 0; i < children.size(); i++) {
            System.out.println(children.get(i));
        }

        System.out.println("\n----- 获取兄弟结点 -----");
        List<String> brothers = mt.getBrothers("脊椎动物");
        for (int i = 0; i < brothers.size(); i++) {
            System.out.println(brothers.get(i));
        }

        System.out.println("\n----- 获取祖先结点 -----");
        List<String> forefathers = mt.getForefathers("人");
        for (int i = 0; i < forefathers.size(); i++) {
            System.out.println(forefathers.get(i));
        }

        System.out.println("\n----- 获取子孙结点 -----");
        List<String> grandChildren = mt.getChildren("root");
        for (int i = 0; i < grandChildren.size(); i++) {
            System.out.println(grandChildren.get(i));
        }
    }
}
