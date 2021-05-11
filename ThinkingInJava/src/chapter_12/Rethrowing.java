
/**
 * Author: Bruce Eckel 
 * Thinking in Java
 * @version 4.0 
 */

/**
 *
 */

public class Rethrowing {
    public static void f()   throws Exception {
        System.out.println("originating the exception in f()");
        throw new Exception("Thrown from f()");
    }

    public static void g() throws Exception {
        try {
            f();
        } catch(Exception e) {
            System.out.println("Inside g(), e.printStackTrace()");
            e.printStackTrace(System.out);
            throw e;
        }
    }

    public static void h() throws Exception {
        try {
            f();
        } catch(Exception e) {
            System.out.println("Inside h(), e.printStackTrace()");
            e.printStackTrace(System.out);
            throw (Exception) e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            g();
        } catch(Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }

        try {
            h();
        } catch(Exception e) {
            System.out.println("main:printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
}

/*
output:
originating the exception in f()
Inside g(), e.printStackTrace()
java.lang.Exception: Thrown from f()
	at Rethrowing.f(Rethrowing.java:15)
	at Rethrowing.g(Rethrowing.java:20)
	at Rethrowing.main(Rethrowing.java:40)
main: printStackTrace()
java.lang.Exception: Thrown from f()
	at Rethrowing.f(Rethrowing.java:15)
	at Rethrowing.g(Rethrowing.java:20)
	at Rethrowing.main(Rethrowing.java:40)
originating the exception in f()
Inside h(), e.printStackTrace()
java.lang.Exception: Thrown from f()
	at Rethrowing.f(Rethrowing.java:15)
	at Rethrowing.h(Rethrowing.java:30)
	at Rethrowing.main(Rethrowing.java:47)
main:printStackTrace()
java.lang.Exception: Thrown from f()
	at Rethrowing.h(Rethrowing.java:34)
	at Rethrowing.main(Rethrowing.java:47)
*/
