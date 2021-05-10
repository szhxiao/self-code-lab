/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCaseTracker {
    public static void trackUseCase(List<Integer> useCases, Class<?> cl) {
        for (Method method : cl.getDeclaredMethods()) {
            UseCase uc = method.getAnnotation(UseCase.class);
            if (uc != null) {
                System.out.println("Found Use Case: " + uc.id() + " " + uc.description());
                useCases.remove(new Integer(uc.id()));
            }
        }

        for (int i : useCases) {
            System.out.println("Warning: Missing use case - " + i);
        }
    }

    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<>();
        Collections.addAll(useCases, 47, 48, 49, 50);
        trackUseCase(useCases, PasswordUtils.class);
    }
}

/**
 * output:
 * 
 */