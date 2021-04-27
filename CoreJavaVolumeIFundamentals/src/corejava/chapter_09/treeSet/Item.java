/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.util.Objects;

/**
 * An item with a description and a part number.
 */
public class Item implements Comparable<Item> {
    private String description;
    private int partNumber;

    /**
     * Constructs an item
     * 
     * @param description the item's description
     * @param partNumber the item's part number
     */
    public Item(String description, int partNumber) {
        this.description = description;
        this.partNumber = partNumber;
    }

    /**
     * Gets the description of this item
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    public String toString() {
        return "[ description = " + description + ", partNumber = "
            + partNumber + " ]";
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null) {
            return false;
        }
        if (getClass() != otherObject.getClass()) {
            return false;
        }
        Item other = (Item) otherObject;
        return Objects.equals(description, other.description) && partNumber == other.partNumber;
    }

    public int hashCode() {
        return Objects.hash(description, partNumber);
    }

    public int compareTo(Item other) {
        int diff = Integer.compare(partNumber, other.partNumber);
        return diff != 0 ? diff : description.compareTo(other.description);
    }
}