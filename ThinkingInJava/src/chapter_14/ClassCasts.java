/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

class Building {}

class House extends Building {}

public class ClassCasts {

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        h = (House) b;
    }
}

/**
 * output:
 * 
 */