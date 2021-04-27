
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 异常处理
 */

class OpenException extends Exception {

}

class CloseException extends OpenException {

}

public class ThrowException {
    public static int open() {
        int[] a = new int[10];
        a[10] = 10;
        return -1;
    }

    public static void readFile() throws OpenException, CloseException {
        if (open() == -1) {
            throw new CloseException();
        }
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (CloseException e) {
            e.printStackTrace();
            System.out.println("Caught CloseException");
        } catch (OpenException e) {
            e.printStackTrace();
            System.out.println("Caught OpenException");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Caught Anything");
        }
    }

}

/**
 * output:
 *
 */