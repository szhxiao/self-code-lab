
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

/**
 * 
 */
public class HandlerBye extends Handler {

    public HandlerBye(Game game) {
        super(game);
    }

    @Override
    public boolean isBye() {
        return true;
    }
}

/**
 * output:
 *
 */