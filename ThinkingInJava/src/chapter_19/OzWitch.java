/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

public enum OzWitch {
    // Instances must be defined first, before methods
    WEST("Miss Gulch, aka the Wicked Witch of the West"), 
    NORTH("Glinda, the Good Witch of the North"),
    EAST("Wicked Witch of the East, wearer of the Ruby Slippers, crushed by Dorothy's house"),
    SOUTH("Good by inference, but missing");

    private String description;

    private OzWitch(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        for (OzWitch witch : OzWitch.values()) {
            System.out.println(witch + ": " + witch.getDescription());
        }
    }
}

/**
 * output:
 * WEST: Miss Gulch, aka the Wicked Witch of the West
 * NORTH: Glinda, the Good Witch of the North
 * EAST: Wicked Witch of the East, wearer of the Ruby Slippers, crushed by Dorothy's house
 * SOUTH: Good by inference, but missing
 */