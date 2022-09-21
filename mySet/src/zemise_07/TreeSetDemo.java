package zemise_07;

import java.util.Comparator;
import java.util.TreeSet;

/*
    需求：
        用Treeset集合存储多个学生信息(姓名，语文成绩，数学成绩），并遍历该集合
        要求：按照总分从高到低出现

    思路：
        1：定义学生类
        2：创建TreeSet集合对象，通过比较器排序进行排序
        3：创建学生对象
        4：把学生对象添加到集合
        5：遍历集合
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        //2：创建TreeSet集合对象，通过比较器排序进行排序
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.getSum() - s1.getSum();
                int num2 = num == 0 ? s2.getName().compareTo(s1.getName()) : num;
                return num2;
            }
        });

        //创建学生对象
        Student s1 = new Student("xishi", 80,90);
        Student s2 = new Student("diaochan", 81,91);
        Student s3 = new Student("wangzhaojun", 82,92);
        Student s4 = new Student("lindaiyu", 83,93);

        Student s5 = new Student("linqinxia", 84,94);
        Student s6 = new Student("linqinxia", 84,94);
        Student s7 = new Student("fengqingyang", 70,70);

        //把学生添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);


        //遍历集合
        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getLanguageScore()+"," + s.getMathScore()+", 总分：" + s.getSum());
        }


    }
}
