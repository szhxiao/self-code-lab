/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 *
 */

interface HasBatteries {}
interface Waterproof{}
interface Shoots {}

class Toy {
    Toy() {}
    Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {

    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() + 
                " is interface? [ " + cc.isInterface() + " ]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("FancyToy");
        } catch(ClassNotFoundException e) {
            System.out.println("Cant't find FancyToy'");
            System.exit(1);
        }
        printInfo(c);
        for(Class face : c.getInterfaces()) {
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch(InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch(IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}

/**
 * output:
 * Class name: FancyToy is interface? [ false ]
 * Simple name: FancyToy
 * Canonical name: FancyToy
 * Class name: HasBatteries is interface? [ true ]
 * Simple name: HasBatteries
 * Canonical name: HasBatteries
 * Class name: Waterproof is interface? [ true ]
 * Simple name: Waterproof
 * Canonical name: Waterproof
 * Class name: Shoots is interface? [ true ]
 * Simple name: Shoots
 * Canonical name: Shoots
 * Class name: Toy is interface? [ false ]
 * Simple name: Toy
 * Canonical name: Toy
 */