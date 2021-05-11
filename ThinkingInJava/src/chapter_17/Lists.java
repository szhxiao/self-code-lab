/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Things we can do with Lists.
 */
public class Lists {
    private static boolean b;
    private static String s;
    private static int i;
    private static Iterator<String> it;
    private static ListIterator<String> lit;

    public static void basicTest(List<String> a) {
        // Add at location 1
        a.add(1, "x");

        // Add at end
        a.add("x");

        // Add a collection
        a.addAll(Countries.names(4));
        a.addAll(3, Countries.names(4));

        b = a.contains("1");
        b = a.contains(Countries.names(4));

        s = a.get(1);
        i = a.indexOf("1");
        b = a.isEmpty();

        a.remove(1);
        a.remove("3");
        a.set(1, "y");

        a.retainAll(Countries.names(4));

        a.removeAll(Countries.names(4));

        i = a.size();
        a.clear();
    }
    
    public static void iterMotion(List<String> a) {
        ListIterator<String> it = a.listIterator();
        b = it.hasNext();
        b = it.hasPrevious();
        s = it.next();
        i = it.nextIndex();
        s = it.previous();
        i = it.previousIndex();
    }

    public static void iterManipulation(List<String> a) {
        ListIterator<String> it = a.listIterator();
        it.add("47");
        // Must move to an element after add()
        it.next();
        // Remove the element after the newly produced one
        it.remove();
        // Must move to an element after remove()
        it.next();
        // Change the element after the deleted one
        it.set("47");
    }

    public static void testVisual(List<String> a) {
        System.out.println(a);
        List<String> b = Countries.names(5);
        System.out.println("b = " + b);
        a.addAll(b);
        a.addAll(b);
        System.out.println(a);

        ListIterator<String> x = a.listIterator(a.size() / 2);
        x.add("one");
        System.out.println(a);
        System.out.println(x.next());
        x.remove();
        System.out.println(x.next());
        x.set("47");
        System.out.println(a);
        x = a.listIterator(a.size());
        while (x.hasPrevious()) {
            System.out.print(x.previous() + " ");
        }
        System.out.println();
        System.out.println("testVisiual finished");
    }

    public static void testLinkedList() {
        LinkedList<String> ll = new LinkedList<>();
        ll.addAll(Countries.names(5));
        System.out.println(ll);

        ll.addFirst("one");
        ll.addFirst("two");
        System.out.println(ll);

        System.out.println(ll.getFirst());

        System.out.println(ll.removeFirst());
        System.out.println(ll.removeFirst());

        System.out.println(ll.removeLast());
        System.out.println(ll);
    }

    public static void main(String[] args) {
        basicTest(new LinkedList<>(Countries.names(5)));
        basicTest(new ArrayList<>(Countries.names(5)));
        iterMotion(new LinkedList<>(Countries.names(5)));
        iterMotion(new ArrayList<>(Countries.names(5)));
        iterManipulation(new LinkedList<>(Countries.names(5)));
        iterManipulation(new ArrayList<>(Countries.names(5)));
        testVisual(new LinkedList<>(Countries.names(5)));
        testLinkedList();
    }
}

/**
 * output:
 * [ALGERIA, ANGOLA, BENIN, BOTSWANA, BURKINA FASO]
 * b = [ALGERIA, ANGOLA, BENIN, BOTSWANA, BURKINA FASO]
 * [ALGERIA, ANGOLA, BENIN, BOTSWANA, BURKINA FASO, ALGERIA, ANGOLA, 
 * BENIN, BOTSWANA, BURKINA FASO, ALGERIA, ANGOLA, BENIN, BOTSWANA, BURKINA FASO]
 * [ALGERIA, ANGOLA, BENIN, BOTSWANA, BURKINA FASO, ALGERIA, ANGOLA, 
 * one, BENIN, BOTSWANA, BURKINA FASO, ALGERIA, ANGOLA, BENIN, BOTSWANA, BURKINA FASO]
 * BENIN
 * BOTSWANA
 * [ALGERIA, ANGOLA, BENIN, BOTSWANA, BURKINA FASO, ALGERIA, ANGOLA, one, 
 * 47, BURKINA FASO, ALGERIA, ANGOLA, BENIN, BOTSWANA, BURKINA FASO]
 * BURKINA FASO BOTSWANA BENIN ANGOLA ALGERIA BURKINA FASO 
 * 47 one ANGOLA ALGERIA BURKINA FASO BOTSWANA BENIN ANGOLA ALGERIA 
 * testVisiual finished
 * [ALGERIA, ANGOLA, BENIN, BOTSWANA, BURKINA FASO]
 * [two, one, ALGERIA, ANGOLA, BENIN, BOTSWANA, BURKINA FASO]
 * two
 * two
 * one
 * BURKINA FASO
 * [ALGERIA, ANGOLA, BENIN, BOTSWANA]
 */