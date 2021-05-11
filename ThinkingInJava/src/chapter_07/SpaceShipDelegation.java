/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = 
        new SpaceShipControls();

    pbulic SpaceShipDelegation(String name) {
        this.name = name;
    }

    public void up(int velocity) {
        controls.up(velocity);
    }

    public void down(int velocity) {
        controls.down(velocity);
    }

    public void left(int velocity) {
        controls.left(velocity);
    }

    public void right(int velocity) {
        controls.right(velocity);
    }

    public void forward(int velocity) {
        controls.forward(velocity);
    }

    public void back(int velocity) {
        controls.back(velocity);
    }

    public void turboBoost() {
        controls.turboBoost();
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation();
        protector.forward(100);
    }
}

/**
 * Inside Bath()
 * Soap()
 * s1 = Happy
 * s2 = Happy
 * s3 = Joy
 * s4 = Joy
 * i = 47
 * toy = 3.14
 * castille = Constructed
 */
