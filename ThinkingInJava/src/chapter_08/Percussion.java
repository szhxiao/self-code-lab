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
public class Percussion extends Instrument3 {
    // Redefine interface method
    @Override
    public void play(Note note) {
        System.out.println("Percussion.play() " + note);
    }

    @Override
    public String what() {
        return "Percussion";
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Percussion");
    }
}