/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates the protect key word.
 */

/*
 * basic class {@code Villain}
 */

class Villain {
    private String name;

    /**
     * Villain constructor
     */
    public Villain(String name) {
        this.name = name;
    }

    /**
     * method set name
     */
    protected void set(String name) {
        this.name = name;
    }

    public String toString() {
        return "I'm Villain and my name is " + name;
    }
}

/**
 * child class {@code Orc}
 */
public class Orc extends Villain {
    private int orcNumber;

    /**
     * Orc constructor
     *
     * @param name
     * @param orcNumber
     */
    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }

    /**
     * method change name and orcNumber
     *
     * @param name
     * @param orcNumber
     */
    public void change(String name, int orcNumber) {
        set(name);
        this.orcNumber = orcNumber;
    }

    public String toString() {
        return "Orc" + orcNumber + ": " + super.toString();
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Orc orc = new Orc("Limburger", 12);
        System.out.println(orc);
        orc.change("Bob", 19);
        System.out.println(orc);
    }
}

/**
 * output:
 * Orc12: I'm Villain and my name is Limburger
 * Orc19: I'm Villain and my name is Bob
 */
