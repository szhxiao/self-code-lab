/**
 * Effective Java
 * 
 * @version 2nd
 * @author Joshua Bloch
 * @see 
 */


/**
 * JavaBeans Pattern
 */
public class NutritionFacts2 {
    private int servingSize = -1;   // (mL)
    private int servings = -1;      // (per container)
    private int calories = 0;
    private int fat = 0;            // (g)
    private int sodium = 0;         // (mg)
    private nt carbohydrate = 0;    // (g)

    public NutritionFacts2() {}

    // Setters
    public void setServingSize(int val) {
        servingSize = val;
    }

    public void setServings(int val) {
        servings = val;
    }

    public void setCalories(int val) {
        calories = val;
    }

    public void setFat(int val) {
        fat = val;
    }

    public void setSodium(int val) {
        sodium = val;
    }

    public void setCarbohydrate(int val) {
        carbohydrate = val;
    }
}