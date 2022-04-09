/**
 * Effective Java
 * 
 * @version 2nd
 * @author Joshua Bloch
 * @see 
 */


/**
 * Service interface
 */
public interface Service {
    // Service-specific methods go here
}

/**
 * Service provider interface
 */
public interface Provider {
    Service newService();
}

/**
 * Noninstantiable class for service registration and access
 */
public class Services {
    // Prevents instantiation
    private Services() {}

    // Maps service names to services
    private static final Map<String, Provider> providers = 
        new ConcurrentHashMap<String, Provider>();
    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    // Provider registration API
    public static void registerDefaultProvider(Provider p) {
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }
    public static void registerProvider(String name, Provider p) {
        providers.put(name, p);
    }

    // Service access API
    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }
    public static Service newInstance(String name) {
        Provider p = proficers.get(name);
        if(p == null) throw new IllegalArgumentException(
            "No provider registered with name: " + name
        );
        return p.newService();
    }

}