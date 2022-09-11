package zemise01;

/*
    学生管理系统
 */

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        //创建一个学生对象，用于存储所有学生的信息
        ArrayList<Student> Array = new ArrayList<>();


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
                    ("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    addStudent(Array);
                    break;
                }
                case "2": {
                    System.out.println("删除学生");
                    //删除学生信息
                    System.out.println("请输入你要修改的学生学号：");
                    String sid = sc.nextLine();

                    int index = 0;
                    for(int i = 1;i<Array.size();i++){
                        Student k = new Student();
                        k = Array.get(i);
                        if(k.getSid() == sid){
                            index = i;
                            break;
                        }
                    }

                    //根据index，删除对应的学生信息
                    Array.remove(index);
                    System.out.println("删除学生信息成功！");
                    break;

                }
                case "3": {
                    System.out.println("修改学生");
                    //修改学生信息
                    System.out.println("请输入你要修改的学生学号：");
                    String sid = sc.nextLine();
                    //根据修改的学生的学号，来查找学生集合里的所在位置
                    //<(sid name age address), (sid1 name1 age1 address1)>

                    //todo 此处有错误，没有正确调出index
                    //int index = Array.indexOf(sid);错误！
                    //只能先遍历了

                    int index = 0;
                    for(int i = 1;i<Array.size();i++){
                        Student k = new Student();
                        k = Array.get(i);
                        if(k.getSid() == sid){
                            index = i;
                            break;
                        }
                    }

                    //获取修改学生的新信息

                    System.out.println("请输入学生的新姓名：");
                    String name = sc.nextLine();
                    System.out.println("请输入学生的新年龄：");
                    String age = sc.nextLine();
                    System.out.println("请输入学生的新居住地：");
                    String address = sc.nextLine();

                    //根据index，和新信息修改学生集合
                    Student student = new Student();
                    student.setSid(sid);
                    student.setName(name);
                    student.setAge(age);
                    student.setAddress(address);

                    Array.set(index, student);
                    System.out.println("修改学生信息成功！");

                    break;
                }
                case "4": {
                    System.out.println("查看所有学生");
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
                    System.out.println("");
                    s = "5";
                }
            }
        }
    }

    //定义一个方法，用于添加学生信息
    public static void addStudent(ArrayList<Student> array) {
        //键盘录入学生对象所需要的数据，显示提示信息，提示要输入何种信息
        Scanner sc = new Scanner(System.in);
        System.out.println("添加学生");

        System.out.println("请输入学生学号：");
        String sid = sc.nextLine();
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();

        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s =new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //将学生对象添加到集合中
        array.add(s);
        System.out.println("添加学生信息成功！");
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
