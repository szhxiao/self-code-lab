
/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see
 */

import java.awt.*;
import java.awt.event.*;

public class PlaneWarFrame extends Frame {
    Image backgroundImage = GameUtil.getImage("images/background.jpg");
    Image planeImage = GameUtil.getImage("images/plane_48px.png");

    // GameObject plane = new GameObject(planeImage, 100, 100, 48, 48, 20);
    Plane plane1 = new Plane(planeImage, 100, 100, 3);
    // Plane plane2 = new Plane(planeImage, 100, 200, 4);
    // Plane plane3 = new Plane(planeImage, 100, 300, 2);

    // const int count = 0;

    @Override
    public void paint(Graphics g) {
        // System.out.println("绘制窗口数：" + count);
        // count++;

        g.drawImage(backgroundImage, 0, 0, ConstVar.GAME_WIDTH, ConstVar.GAME_HEIGHT, null);
        // System.out.println("背景绘制完毕");

        plane1.drawSelf(g);
        // plane2.drawSelf(g);
        // plane3.drawSelf(g);

    }

    class PaintThread extends Thread {
        @Override
        public void run() {
            while (true) {
                repaint();
                try {
                    Thread.sleep(20);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class KeyMoniter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("按下" + e.getKeyCode());
            // if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            // left = true;
            // }
            // if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            // right = true;
            // }
            // if (e.getKeyCode() == KeyEvent.VK_UP) {
            // up = true;
            // }
            // if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            // down = true;
            // }
            plane1.addDirection(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("抬起" + e.getKeyCode());
            plane1.minusDirection(e);
        }
    }

    public void launchFrame() {
        this.setTitle("飞机大战");
        setVisible(true);

        setSize(800, 800);
        setLocation(400, 400);

        new PaintThread().start();
        this.addKeyListener(new KeyMoniter());
    }

    // 双缓冲
    // private Image offScreenImage = null;

    // public void update(Graphics g) {
    // if (offScreenImage == null) {
    // offScreenImage = this.createImage(800, 800);

    // Graphics gOff = offScreenImage.getGraphics();
    // paint(gOff);
    // g.drawImage(offScreenImage, 0, 0, null);
    // }
    // }

    public static void main(String[] args) {
        PlaneWarFrame planeWarFrame = new PlaneWarFrame();
        planeWarFrame.launchFrame();
    }
}
