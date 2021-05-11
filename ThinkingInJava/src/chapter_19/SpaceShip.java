/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */


public enum SpaceShip {
    SCOUT, CARGO, TRANSPORT, CRUISER, BATTLESHIP, MOTHERSHIP;

    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0) + lower;
    }

    public static void main(String[] args) {
        for (SpaceShip ship : values()) {
            System.out.println(ship);
        }
    }
}

/**
 * output:
 * Scout
 * Cargo
 * Transport
 * Cruiser
 * Battleship
 * Mothership
 */