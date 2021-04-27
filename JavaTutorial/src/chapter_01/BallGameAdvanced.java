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

public class BallGameAdvanced extends JFrame{

    Image ball = Toolkit.getDefaultToolkit().getImage("ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("desk.jpg");

    double x = 100;     // 小球横坐标
    double y = 100;     // 小球纵坐标

    double degree = Math.PI/3;     // 弧度，此处为60度

    public void paint(Graphics g) {
        System.out.println("绘制窗口");
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball, (int)x, (int)y, null);

        x = x + 10 * Math.cos(degree);
        y = y + 10 * Math.sin(degree);

        if (y > 500 - 40 -30 | y < 40 + 40) {
            degree = -degree;
        }
        if (x < 40 | x > 856 - 40 - 40) {
            degree = 3.14 - degree;
        }
    }
    void launchFrame() {
        setSize(856, 500);
        setLocation(50, 50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
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
    public static void main(String[] args) {
        BallGameAdvanced ballGame = new BallGameAdvanced();
        ballGame.launchFrame();
    }
}