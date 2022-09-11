package zemise01;

/*
    学生管理系统
 */

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        //创建一个学生对象的集合，用于存储所有学生的信息
        ArrayList<Student> Array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (String s = "0"; !s.equals("5"); ) {
            //键盘录入管理页面的选择

            //管理界面提示系统
            System.out.println("------------------欢迎来到学生管理系统------------------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println
                    ("请输出你的选择：");
            s = sc.nextLine();

            switch (s) {
                case "1": {
                    System.out.println("请输入学生学号：");
                    String sid = sc.nextLine();
                    System.out.println("请输入学生姓名：");
                    String name = sc.nextLine();
                    System.out.println("请输入学生年龄：");
                    String age = sc.nextLine();
                    System.out.println("请输入学生居住地：");
                    String address = sc.nextLine();

                    Student student = new Student();
                    student.setSid(sid);
                    student.setName(name);
                    student.setAge(age);
                    student.setAddress(address);

                    Array.add(student);
                    System.out.println("添加学生成功！");
                    break;
                }
                case "2": {
                    break;
                }
                case "3": {
                    break;
                }
                case "4": {
                    System.out.println("学号" + "    姓名" + "    年龄" + "    居住地");
                    //查看所有学生
                    for (int i = 0; i < Array.size(); i++) {
                        Student student = new Student();
                        student = Array.get(i);
                        System.out.println(student.getSid() + "    " + student.getName() + "    " + student.getAge() + "    " + student.getAddress());
                    }
                    break;
                }
                case "5": {
                    s = "5";
                }
            }
        }
    }

    //定义一个方法，用于添加学生信息
    public static void addStudent(ArrayList<Student> array) {

    }

    //定义一个方法，用于查看学生信息
    public static void findAllStudent(ArrayList<Student> array) {
    }

    //定义一个方法，用于删除学生信息
    public static void deleteStudent(ArrayList<Student> array) {
    }

    //定义一个方法，用于修改学生信息
    public static void updateStudent(ArrayList<Student> array) {
    }

}
