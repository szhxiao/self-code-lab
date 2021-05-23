/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 主程序
 */
public class App {
    public static void main(String[] args) {
        App app = new App();
        app.start();
    }
    
    /**
     * 控制主菜单
     */
    public void start() {
        // Menu menu = new Menu();
        TelNoteRegex regex = new TelNoteRegex();
        Operate operate = new Operate();
        while (true) {
            // menu.mainMenu();
            Menu.mainMenu();
            int item = regex.validateMenuItem(1, 8);
            switch (item) {
                case 1:
                    operate.addLogic();
                    break;
                case 2:
                    operate.searchLogic();
                    break;
                case 3:
                    operate.modifyLogic();
                    break;
                case 4:
                    operate.deleteLogic();
                    break;
                case 5:
                    operate.sortLogic();
                    break;
                // case 6:
                //     System.exit(0);
                case 6:
                    operate.outputLogic();
                    break;
                case 7:
                    operate.inputLogic();
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }
}
