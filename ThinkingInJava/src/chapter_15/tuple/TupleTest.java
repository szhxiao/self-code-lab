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

class Amphibian {}
class Vehicle {}

public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<String, Integer>("hi", 27);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<Amphibian, String, Integer> (
            new Amphibian(), "hi", 47
        );
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return new FourTuple<Vehicle, Amphibian, String, Integer> (
            new Vehicle(), new Amphibian(), "hi", 47
        );
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);

        System.out.println(g());
        System.out.println(h());
    }
}

/**
 * output:
 * (hi, 27)
 * (Amphibian@54bedef2, hi, 47)
 * (Vehicle@5674cd4d, Amphibian@63961c42, hi, 47)
 */