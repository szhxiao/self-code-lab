import javax.lang.model.type.NoType;

/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * {@code Spiciness}
 */
public class Burrito {
    Spiciness degree;

    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    public void describe() {
        System.out.print("This burrito is ");

        switch (degree) {
            case NOT:
                System.out.println("not spicy at all.");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("a little hot.");
                break;
            case HOT:
            case FLAMING:
            default:
                System.out.println("maybe too hot.");
                break;
        }
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Burrito
            plain = new Burrito(Spiciness.NOT),
            greenChile = new Burrito(Spiciness.MEDIUM),
            jalapeno = new Burrito(Spiciness.HOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }
}

/**
 * output:
 * This burrito is not spicy at all.
 * This burrito is a little hot.
 * This burrito is maybe too hot.
 */