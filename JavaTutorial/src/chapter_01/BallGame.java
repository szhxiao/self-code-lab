/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.*;

public class BallGame extends JFrame{

    Image ball = Toolkit.getDefaultToolkit().getImage("ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("desk.jpg");

    double x = 100;     // 小球横坐标
    double y = 100;     // 小球纵坐标

    boolean right = true;

    public void paint(Graphics g) {
        System.out.println("窗口绘制一次");
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball, (int)x, (int)y, null);

        if (right) {
            x = x + 5;
        } else {
            x = x - 5;
        }

        if (x > 856 - 40 - 30) {
            right = false;
        }
        
        if (x < 40) {
            right = true;
        }
    }
    void launchFrame() {
        setSize(856, 500);
        setLocation(50, 50);
        setVisible(true);

        while (true) {
            repaint();
            try {
                Thread.sleep(40);
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
        }
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        BallGame ballGame = new BallGame();
        ballGame.launchFrame();
    }
}