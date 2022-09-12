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
                    deleteStudent(Array);
                    break;
                }
                case "3": {
                    updateStudent(Array);
                    break;
                }
                case "4": {
                    findAllStudent(Array);
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
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //将学生对象添加到集合中
        array.add(s);
        System.out.println("添加学生信息成功！");
    }

    //定义一个方法，判断学生是否被使用
    public static boolean isUsed(ArrayList<Student> array, String sid){
        //如果与集合中的某一个学生学号相同，返回为true；如果都不相同，返回为false
        boolean flag = false;
        for(int i = 0; i< array.size(); i++){
            //array.get(i)
        }
        return flag;

    }

    //定义一个方法，用于查看学生信息
    public static void findAllStudent(ArrayList<Student> array) {

        if(array.size() == 0){
            System.out.println("无信息，清先添加学生信息");
            //为了让程序不再继续执行
            return;
        }else {
            //显示表头信息
            //\t其实就是tab键的位置
            System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");

            //将集合中的数据取出按照对应格式显示学生信息，年龄显示补充"岁"
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                System.out.println(s.getSid() + "\t\t\t" + s.getName() + "\t\t" + s.getAge() + "岁\t" + s.getAddress());
            }
        }

    }

    //定义一个方法，用于删除学生信息
    public static void deleteStudent(ArrayList<Student> array) {

        Scanner sc = new Scanner(System.in);
        System.out.println("删除学生");
        //删除学生信息
        System.out.println("请输入你要删除的学生学号：");
        String sid = sc.nextLine();

        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student k = array.get(i);
            if (k.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("该信息不存在，请重新输入");
        }else{
            array.remove(index);
            System.out.println("删除学生信息成功！");
        }
    }

    //定义一个方法，用于修改学生信息
    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入需要修改的学生的学号");
        String sid = sc.nextLine();

        System.out.println("请输入学生新姓名：");
        String name = sc.nextLine();

        System.out.println("请输入学生新年龄：");
        String age = sc.nextLine();

        System.out.println("请输入学生新居住地：");
        String address = sc.nextLine();

        //创建新的学生对象
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        for (int i = 0; i < array.size(); i++) {
            Student k = array.get(i);
            if (k.getSid().equals(sid)) {
                array.set(i, s);
                break;
            }
        }

        System.out.println("修改学生成功");
    }

}
