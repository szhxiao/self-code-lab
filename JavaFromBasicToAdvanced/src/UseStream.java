
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 
 */
public class UseStream {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket(InetAddress.getByName("localhost"), 12345);
            PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
            out.println("hello world");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;
            line = in.readLine();
            System.out.println(line);
            out.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

/**
 * output:
 *
 */