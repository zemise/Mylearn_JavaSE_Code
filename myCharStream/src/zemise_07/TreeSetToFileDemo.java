package zemise_07;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
    需求：键盘录入5个学生信息(姓名，语文成绩，数学成绩，英语成绩）。要求按照成绩总分从高到低写入文本文件
        格式：姓名，语文成绩，数学成绩，英语成绩举例：林青電，98，99，100

    思路：
        1：定义学生类
        2：创建 TreeSet集合，通过比较器排序进行排序
        3：键盘录人学生数据
        4：创建学生对象，把键盘录入的数据对应赋值给学生对象的成员变量
        5：把学生对象添加到TreeSet集合
        6：创建字符緩冲输出流对象
        7：遍历集合，得到每一个学生对象
        8：把学生对象的数据拼接成指定格式的字符串
        9：调用字符缓冲输出流对象的方法写数据
        10：释放资源
 */
public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        //2：创建 TreeSet集合，通过比较器排序进行排序
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //成绩总分从高到低
                int num = s2.getTotal_Score() - s1.getTotal_Score();
                //次要条件
                int num2 = num == 0 ? s1.getChinese_Score() - s2.getChinese_Score() : num;
                int num3 = num2 == 0 ? s1.getMath_Score() - s2.getMath_Score() : num2;
                int num4 = num3 == 0 ? s1.getName().compareTo(s2.getName()) : num3;

                return num4;
            }
        });

        //录入三次
        for (int i = 0; i < 3; i++) {
            studentToTreeSet(ts);
        }


        //6：创建字符緩冲输出流对象
        BufferedWriter br = new BufferedWriter(new FileWriter("myCharStream/TreeSetToFile.txt"));

        //7：遍历集合，得到每一个学生对象
        for (Student s : ts) {
            //8：把学生对象的数据拼接成指定格式的字符串
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(",").append(s.getChinese_Score()).
                    append(",").append(s.getMath_Score()).append(",").
                    append(s.getEnglish_Score());

            ////9：调用字符缓冲输出流对象的方法写数据
            br.write(sb.toString());
            br.newLine();
            br.flush();
        }

        //10：释放资源
        br.close();

    }

    //录入学生数据并添加到TreeSet集合
    public static void studentToTreeSet(TreeSet treeSet) {
        //3：键盘录人学生数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生名字：");
        String name = sc.nextLine();
        System.out.println("请输入" + name + "的语文成绩：");
        int chinese_score = sc.nextInt();
        System.out.println("请输入" + name + "的数学成绩：");
        int math_score = sc.nextInt();
        System.out.println("请输入" + name + "的英语成绩：");
        int English_score = sc.nextInt();
        //4：创建学生对象，把键盘录入的数据对应赋值给学生对象的成员变量
        Student s = new Student(name, chinese_score, math_score, English_score);
        //5：把学生对象添加到TreeSet集合
        treeSet.add(s);
    }
}
