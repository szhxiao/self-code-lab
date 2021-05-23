/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Operate {
    private List<Person> list;

    public Operate() {
        list = new ArrayList<>();
    }

    /**
     * 添加记录
     */
    public void addLogic() {
        System.out.println("add -->");
        TelNoteRegex regex = new TelNoteRegex();
        while (true) {
            Menu.addMenu();
            int item = regex.validateMenuItem(1, 3);
            switch (item) {
                case 1:
                    add();
                    break;
                case 2:
                    getAll();
                    break;
                case 3:
                    return;
            }
        }
    }

    /**
     * 查找记录
     */
    public void searchLogic() {
        System.out.println("search -->");
        TelNoteRegex regex = new TelNoteRegex();
        while (true) {
            Menu.searchMenu();
            int item = regex.validateMenuItem(1, 7);
            switch (item) {
                case 1:
                    getByName();
                    break;
                case 2:
                    getByAge();
                    break;
                case 3:
                    getBySex();
                    break;
                case 4:
                    getByTelNum();
                    break;
                case 5:
                    getByAddress();
                    break;
                case 6:
                    getAll();
                    break;
                case 7:
                    return;
            }
        }
    }

    /**
     * 修改记录
     */
    public void modifyLogic() {
        System.out.println("modify -->");
        TelNoteRegex regex = new TelNoteRegex();
        while (true) {
            Menu.modifyMenu();
            int item = regex.validateMenuItem(1, 3);
            switch (item) {
                case 1:
                    getAll();
                    break;
                case 2:
                    modify();
                    break;
                case 3:
                    return;
            }
        }
    }

    /**
     * 删除记录
     */
    public void deleteLogic() {
        System.out.println("delete -->");
        TelNoteRegex regex = new TelNoteRegex();
        while (true) {
            Menu.deleteMenu();
            int item = regex.validateMenuItem(1, 4);
            switch (item) {
                case 1:
                    getAll();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    deleteAll();
                    break;
                case 4:
                    return;
            }
        }
    }

    /**
     * 排序记录
     */
    public void sortLogic() {
        System.out.println("sort -->");
        TelNoteRegex regex = new TelNoteRegex();
        while (true) {
            Menu.sortMenu();
            int item = regex.validateMenuItem(1, 5);
            switch (item) {
                case 1:
                    sortByName();
                    break;
                case 2:
                    sortByAge();
                    break;
                case 3:
                    sortByTelNum();
                    break;
                case 4:
                    getAll();
                    break;
                case 5:
                    return;
            }
        }
    }

    /**
     * 输出数据
     */
    public void outputLogic() {
        System.out.println("output -->");
        outputData();
    }

    /**
     * 输出数据
     */
    public void inputLogic() {
        System.out.println("input -->");
        inputData();
    }

    /**
     * 添加记录业务功能
     */
    public void add() {
        TelNoteRegex regex = new TelNoteRegex();
        String name = regex.validateName();
        int age = regex.validateAge();
        String sex = regex.validateSex();
        String telNum = regex.validateTelNum();
        String address = regex.validateAddress();

        Person person = new Person(name, age, sex, telNum, address);
        list.add(person);
        person.setId(list.size());
        System.out.println("提示：记录添加成功");
    }

    /**
     * 查询全部记录
     */
    public void getAll() {
        if (list.size() == 0) {
            System.out.println("提示：没有任何记录");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    /**
     * 按姓名查找
     */
    public void getByName() {
        TelNoteRegex regex = new TelNoteRegex();
        String name = regex.validateName();

        boolean flag = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                System.out.println(list.get(i));
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("提示：未查询到相关记录");
        }
    }

    /**
     * 按年龄查找
     */
    public void getByAge() {
        TelNoteRegex regex = new TelNoteRegex();
        int age = regex.validateAge();

        boolean flag = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() == age) {
                System.out.println(list.get(i));
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("提示：未查询到相关记录");
        }
    }

    /**
     * 按性别查找
     */
    public void getBySex() {
        TelNoteRegex regex = new TelNoteRegex();
        String sex = regex.validateSex();

        boolean flag = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSex().equalsIgnoreCase(sex)) {
                System.out.println(list.get(i));
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("提示：未查询到相关记录");
        }
    }

    /**
     * 按号码查找
     */
    public void getByTelNum() {
        TelNoteRegex regex = new TelNoteRegex();
        String telNum = regex.validateTelNum();

        boolean flag = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTelNum().equals(telNum)) {
                System.out.println(list.get(i));
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("提示：未查询到相关记录");
        }
    }

    /**
     * 按地址查找
     */
    public void getByAddress() {
        TelNoteRegex regex = new TelNoteRegex();
        String address = regex.validateAddress();

        boolean flag = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAddress().equalsIgnoreCase(address)) {
                System.out.println(list.get(i));
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("提示：未查询到相关记录");
        }
    }

    /**
     * 修改指定记录
     */
    public void modify() {
        TelNoteRegex regex = new TelNoteRegex();

        System.out.println("提示：请输入记录序号");
        int personItem = regex.validateMenuItem(1, list.size());

        Menu.subModifyMenu();
        int menuItem = regex.validateMenuItem(1, 6);
        switch (menuItem) {
            case 1:
                String name = regex.validateName();
                list.get(personItem - 1).setName(name);
                break;
            case 2:
                int age = regex.validateAge();
                list.get(personItem - 1).setAge(age);
                break;
            case 3:
                String sex = regex.validateSex();
                list.get(personItem - 1).setSex(sex);
                break;
            case 4:
                String telNum = regex.validateTelNum();
                list.get(personItem - 1).setTelNum(telNum);
                break;
            case 5:
                String address = regex.validateAddress();
                list.get(personItem - 1).setAddress(address);
                break;
            case 6:
                return;
        }
    }

    /**
     * 删除指定记录
     */
    public void delete() {
        TelNoteRegex regex = new TelNoteRegex();
        System.out.println("提示：请输入记录序号");
        int item = regex.validateMenuItem(1, list.size());
        list.remove(item - 1);
        // 重新设置序号
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setId(i + 1);
        }
        System.out.println("提示：删除成功，请继续操作");
    }

    /**
     * 删除所有记录
     */
    public void deleteAll() {
        list.clear();
        System.out.println("提示：记录已清空，请继续操作");
    }

    /**
     * 按姓名排序
     */
    public void sortByName() {
        Collections.sort(list, new SortByName());
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setId(i + 1);
        }
    }

    /**
     * 按姓名排序
     */
    public void sortByAge() {
        Collections.sort(list, new SortByAge());
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setId(i + 1);
        }
    }

    /**
     * 按号码排序
     */
    public void sortByTelNum() {
        Collections.sort(list, new SortByTelNum());
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setId(i + 1);
        }
    }

    /**
     * 输出数据
     */
    public void outputData() {
        System.out.println("提示：正在输出数据");

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new FileOutputStream("phonebook.txt"));
                
            oos.writeObject(list);
            oos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("提示：数据输出成功");
    }

    /**
     * 读入数据
     */
    public void inputData() {
        System.out.println("提示：正在导入数据");

        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("phonebook.txt"));
            list = (List<Person>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("提示：数据导入成功");
    }

    // 排序类

    /**
     * 按姓名排序
     */
    class SortByName implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }

    /**
     * 按年龄排序
     */
    class SortByAge implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return ((Integer)p1.getAge()).compareTo((Integer)p2.getAge());
        }
    }

    /**
     * 按号码排序
     */
    class SortByTelNum implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.getTelNum().compareTo(p2.getTelNum());
        }
    }
}
