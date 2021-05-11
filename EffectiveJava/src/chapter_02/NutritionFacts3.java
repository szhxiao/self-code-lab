/**
 * Effective Java
 * 
 * @version 2nd
 * @author Joshua Bloch
 * @see 
 */


/**
 * Builder Pattern
 */
public class NutritionFacts3 {
    private final int servingSize;  // (mL)
    private final int servings;     // (per container)
    private final int calories;
    private final int fat;          // (g)
    private final int sodium;       // (mg)
    private final int carbohydrate; // (g)

    public static class Builder {
        // Required parameters
        private final int servingSize;
        private final int servings;

        // Optional parameters
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;
        private int sodium = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public NutritionFacts3 build() {
            return new NutritionFacts3(this);
        }
    }

    private NutritionFacts3(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

}