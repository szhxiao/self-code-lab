/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

public enum Meal {
    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);

    private Food[] values;

    private Meal(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }

    public interface Food {
        enum Appetizer implements Food {
            SALAD, SOUP, SPRING_ROLLS;
        }

        enum MainCourse implements Food {
            LASAGNE, BURRITO, PAD_THAI, LENTILS, HUMMOUS, VINDALOO;
        }

        enum Dessert implements Food {
            TIRAMISU, GELATO, BLACK_FOREST_CAKE, FRUIT, CREME_CARAMEL;
        }

        enum Coffee implements Food {
            BLACK_COFFEE, DECAF_COFFEE, ESPRESSO, LATTE, CAPPUCCINO, TEA, HERB_TEA;
        }
    }

    public Food randomSelection() {
        return Enums.random(values);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (Meal meal : Meal.values()) {
                Food food = meal.randomSelection();
                System.out.println(food);
            }
            System.out.println("--------");
        }
    }

}

/**
 * output:
 * SPRING_ROLLS
 * VINDALOO
 * FRUIT
 * DECAF_COFFEE
 * --------
 * SOUP
 * VINDALOO
 * FRUIT
 * TEA
 * --------
 * SALAD
 * BURRITO
 * FRUIT
 * TEA
 * --------
 * SALAD
 * BURRITO
 * CREME_CARAMEL
 * LATTE
 * --------
 * SOUP
 * BURRITO
 * TIRAMISU
 * ESPRESSO
 * --------
 */