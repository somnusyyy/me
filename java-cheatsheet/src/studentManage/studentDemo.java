package studentManage;

import studentManage.student;

import java.util.ArrayList;
import java.util.Scanner;

public class studentDemo {
    public static void main(String[] args) {

        ArrayList<student> array = new ArrayList<>();
        while (true) {

            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();


            switch (line) {
                case "1":
                    addStudent(array);
                    break;
                case "2":
//                    System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
//                    System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
//                    System.out.println("查看学生");
                    showStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);//jvm exit

            }
        }


    }

    public static void addStudent(ArrayList<student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入学号");
        String sid = sc.nextLine();

        System.out.println("输入姓名");
        String name = sc.nextLine();

        System.out.println("输入年龄");
        String age = sc.nextLine();

        System.out.println("输入地址");
        String address = sc.nextLine();

        student s = new student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        array.add(s);
//        System.out.println("---------------------------------");
//        System.out.println(array);


    }

    public static void deleteStudent(ArrayList<student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("删除学生的学号");
        String sid = sc.nextLine();

        int index = -1;

        for (int i = 0; i < array.size(); i++) {
            student s = array.get(i);
            if (s.getSid().equals(sid)) {
                array.remove(i);
                index = i;
                break;
            }

        }
        if (index != -1) {
            System.out.println("删除学生成功");
        } else {
            System.out.println("学号不存在");
        }

    }

    public static void updateStudent(ArrayList<student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("修改学生的学号");
        String sid = sc.nextLine();
        int index = -1;

        for (int i = 0; i < array.size(); i++) {
            student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                System.out.println("输入要修改的数据：");

                System.out.println("输入学生新姓名");
                String name = sc.nextLine();

                System.out.println("输入学生新年龄");
                String age = sc.nextLine();

                System.out.println("输入学生新地址");
                String address = sc.nextLine();

                s.setName(name);
                s.setAge(age);
                s.setAddress(address);
                break;
            }
        }
        if (index != -1) {
            System.out.println("修改数据成功");
        } else {
            System.out.println("学号不存在");
        }

    }

    public static void showStudent(ArrayList<student> array) {
        if (array.size() == 0) {
            System.out.println("无数据");
        } else {
            System.out.println("   学号\t\t姓名\t年龄\t 地址");
            for (int i = 0; i < array.size(); i++) {
                student s = array.get(i);
                System.out.println(s.getSid() + "\t" + s.getName() + "\t\t" + s.getAge() + "\t" + s.getAddress());

            }
        }


    }
}
