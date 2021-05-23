/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

public class IGenericImpl implements IGeneric<String> {
    
    @Override
    public String getName(String name) {
        return name;
    }

    public static void main(String[] args) {
        IGenericImpl impl = new IGenericImpl();
        String name = impl.getName("hello world");
        System.out.println(name);

        IGeneric<String> ig = new IGenericImpl();
        String igstring = ig.getName("generic");
        System.out.println(igstring);
    }
}
