/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */


/**
 * 继承
 */ 
public class Item {

    protected String title;
    protected int playingTime;
    protected boolean gotIt;
    protected String comment;

    public Item() {

    }

    public Item(String title, 
        int playingTime, boolean gotIt, String comment) {
        super();
        this.title = title;
        this.playingTime = playingTime;
        this.gotIt = gotIt;
        this.comment = comment;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void print() {
        System.out.print(title);
    }

    public static void main(String[] args) {
        
    }
}

/**
 * output:
 *
 */