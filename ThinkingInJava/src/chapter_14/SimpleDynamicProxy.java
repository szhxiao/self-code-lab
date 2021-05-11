/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.lang.reflect.*;

/**
 *
 */

class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;
    
    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable {
        System.out.println("*** proxy: " + proxy.getClass() + 
            ", method: " + method + ", args: " + args);
        if (args != null) {
            for (Object arg : args) {
                System.out.println(" " + arg);
            }
        }
        return method.invoke(proxied, args);
    }
}


public class SimpleDynamicProxy {
    
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);

        // Insert a proxy and call again
        Interface proxy = (Interface) Proxy.newProxyInstance(
            Interface.class.getClassLoader(),
            new Class[] {Interface.class},
            new DynamicProxyHandler(real)
        );
        consumer(proxy);
    }
}

/**
 * output:
 * doSomething
 * somethingElse bonobo
 * *** proxy: class $Proxy0, method: public abstract void Interface.doSomething(), args: null
 * doSomething
 * *** proxy: class $Proxy0, method: public abstract void Interface.somethingElse(java.lang.String), 
 * args: [Ljava.lang.Object;@13221655
 *  bonobo
 * somethingElse bonobo
 */