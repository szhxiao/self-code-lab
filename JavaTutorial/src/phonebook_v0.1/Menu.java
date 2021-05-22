/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

public class Menu {
    // 主界面
    public static void mainMenu() {
        System.out.println("\n********************");
        System.out.println("***** 1 添加记录 *****");
        System.out.println("***** 2 查找记录 *****");
        System.out.println("***** 3 修改记录 *****");
        System.out.println("***** 4 删除记录 *****");
        System.out.println("***** 5 排序记录 *****");
        System.out.println("***** 6 退出系统 *****");
        System.out.println("********************\n");
    }

    // 添加界面
    public static void addMenu() {
        System.out.println("********************");
        System.out.println("**** 1 添加新记录 ****");
        System.out.println("**** 2 查看全记录 ****");
        System.out.println("**** 3 返回上一级 ****");
        System.out.println("********************");
    }

    // 查找界面
    public static void searchMenu() {
        System.out.println("********************");
        System.out.println("**** 1 按姓名查找 ****");
        System.out.println("**** 2 按年龄查找 ****");
        System.out.println("**** 3 按性别查找 ****");
        System.out.println("**** 4 按号码查找 ****");
        System.out.println("**** 5 按住址查找 ****");
        System.out.println("**** 6 查看全记录 ****");
        System.out.println("**** 7 返回上一级 ****");
        System.out.println("********************");
    }

    // 修改界面
    public static void modifyMenu() {
        System.out.println("********************");
        System.out.println("**** 1 查看全记录 ****");
        System.out.println("*** 2 修改指定记录 ***");
        System.out.println("**** 3 返回上一级 ****");
        System.out.println("********************");
    }

    // 修改子界面
    public static void subModifyMenu() {
        System.out.println("********************");
        System.out.println("***** 1 修改姓名 *****");
        System.out.println("***** 2 修改年龄 *****");
        System.out.println("***** 3 修改性别 *****");
        System.out.println("***** 4 修改号码 *****");
        System.out.println("***** 5 修改住址 *****");
        System.out.println("**** 6 返回上一级 ****");
        System.out.println("********************");
    }

    // 删除界面
    public static void deleteMenu() {
        System.out.println("**********************");
        System.out.println("**** 1 查看全记录 ****");
        System.out.println("*** 2 删除指定记录 ***");
        System.out.println("*** 3 删除全部记录 ***");
        System.out.println("**** 4 返回上一级 ****");
        System.out.println("**********************");
    }

    // 排序界面
    public static void sortMenu() {
        System.out.println("********************");
        System.out.println("**** 1 按姓名排序 ****");
        System.out.println("**** 2 按年龄排序 ****");
        System.out.println("**** 3 按号码排序 ****");
        System.out.println("*** 4 查看全部记录 ***");
        System.out.println("**** 5 返回上一级 ****");
        System.out.println("********************");
    }
}
