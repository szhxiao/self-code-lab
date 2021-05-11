/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

enum Activity {
    SITTING, LYING, STANDING, HOPPING, RUNNING, DODGING, JUMPING, FALLING, FLYING
}

public class RandomTest {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(Enums.random(Activity.class) + " ");
        }
    }
}

/**
 * output:
 * STANDING 
 * FLYING 
 * RUNNING 
 * STANDING 
 * RUNNING 
 * STANDING 
 * LYING 
 * DODGING 
 * SITTING 
 * RUNNING 
 * HOPPING 
 * HOPPING 
 * HOPPING 
 * RUNNING 
 * STANDING 
 * LYING 
 * FALLING 
 * RUNNING 
 * FLYING 
 * LYING 
 */