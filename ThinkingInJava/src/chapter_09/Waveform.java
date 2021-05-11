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

public class Waveform {
    
    private static long counter;
    private final long id = counter++;
    
    @Override
    public String toString() {
        return "Waveform " + id;
    }
}


