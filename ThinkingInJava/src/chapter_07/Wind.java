/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates inheritance & upcasting
 */

class Instrument {
    public void play() { }

    static void tune(Instrument i) {
        i.play();
        System.out.println("You can get " + i + " to play;");
    }
}

public class Wind extends Instrument {
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}

/**
 * output:
 * You can get Wind@d70c109 to play;
*/
