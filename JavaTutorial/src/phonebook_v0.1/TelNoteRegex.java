/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.Scanner;

/**
 * 数据校验类
 */
public class TelNoteRegex {

    /**
     * 校验菜单选项
     * 
     * @param min
     * @param max
     * @return
     */
    public int validateMenuItem(int min, int max) {
        // 定义验证正则表达式
        String regex = "[1-9]{1}";
        // 创建键盘输入对象
        Scanner in = new Scanner(System.in);
        int inum;
        while (true) {
            System.out.println("请输入正确的数字(最小为" + min + "，最大为" + max + "): ");
            String input = in.nextLine();
            if (input.matches(regex)) {
                inum = Integer.parseInt(input);
                if (inum < min || inum > max) {
                    System.out.println("输入的菜单项不符，请重新输入！");
                } else {
                    break;
                }
            } else {
                System.out.println("输入数字错误，请检查！");
            }
        }
        return inum;
    }

    /**
     * 校验姓名，长度为1－10间
     * @return
     */
    public String validateName() {
        String regex = "[a-zA-Z]{1,10}";
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("请输入姓名，格式为：1-10间的大写或小写字母");
            String input = in.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("输入的姓名有误，请重新输入");
            }
        }
    }

    /**
     * 校验年龄
     * @return
     */
    public int validateAge() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("请输入年龄：格式为1-200间的整数");
            int input = in.nextInt();
            if (input > 0 && input <= 200) {
                return input;
            } else {
                System.out.println("输入的年龄有误，请重新输入");
            }
        }
    }

    /**
     * 校验性别
     * @return
     */
    public String validateSex() {
        String regex = "[mMfF]{1}";
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("请输入性别：(男 m or M)(女 f or F)");
            String input = in.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("输入性别有误，请重新输入");
            }
        }
    }

    /**
     * 校验电话号码
     * 允许带区号的座机号或手机号
     * @return
     */
    public String validateTelNum() {
        String regex = "(\\d{3,4}-\\d{7,8})|([1]{1}\\d{10})";
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("请输入电话号码：可以是座机或手机号");
            String input = in.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("输入的电话号码有误，请重新输入");
            }
        }
    }

    /**
     * 校验地址
     * @return
     */
    public String validateAddress() {
        String regex = "\\w{1,50}";
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("请输入地址：格式为字母或数字，长度为1-50");
            String input = in.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("输入的地址有误，请重新输入");
            }
        }
    }

    /**
     * Unit test
     * 
     * @param args
     */
    public static void main(String[] args) {
        TelNoteRegex tng = new TelNoteRegex();
        // int menuItem = tng.ValidateMenuItem(1, 6);
        // System.out.println("Got menu item: " + menuItem);

        // String name = tng.ValidateName();
        // System.out.println("Got name: " + name);

        int age = tng.validateAge();
        System.out.println("Got age: " + age);
    }
}
