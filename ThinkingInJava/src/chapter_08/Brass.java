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
public class Brass extends Instrument3 {
    // Redefine interface method
    @Override
    public void play(Note note) {
        System.out.println("Brass.play() " + note);
    }

    // @Override
    // public String what() {
    //     return "Brass";
    // }

    @Override
    public void adjust() {
        System.out.println("Adjusting Brass");
    }
}