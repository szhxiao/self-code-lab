
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

    Plane plane1 = new Plane(planeImage, 100, 100, 3);
    Shell[] shells = new Shell[ConstVar.SHELL_NUMBERS];

    boolean bump = false;

    Explode explode;

    @Override
    public void paint(Graphics g) {

        g.drawImage(backgroundImage, 0, 0, ConstVar.GAME_WIDTH, ConstVar.GAME_HEIGHT, null);

        plane1.drawSelf(g);

        // 炮弹绘制
        for (int i = 0; i < shells.length; i++) {
            shells[i].drawSelf(g);

            // 碰撞检测
            bump = shells[i].getRect().intersects(plane1.getRect());

            if (bump) {
                System.out.printf("飞机被%d击中%n", i);
                plane1.isAlive = false;

                if (explode == null) {
                    explode = new Explode(plane1.x, plane1.y);
                }
                explode.drawSelf(g);
            }
        }

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

        for (int i = 0; i < shells.length; i++) {
            shells[i] = new Shell();
        }
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
