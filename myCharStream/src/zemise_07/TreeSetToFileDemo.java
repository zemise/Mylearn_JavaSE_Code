package zemise_07;

import java.util.Comparator;
import java.util.TreeSet;

/*
    需求：键盘录入5个学生信息(姓名，语文成绩，数学成绩，英语成绩）。要求按照成绩总分从高到低写入文本文件
        格式：姓名，语文成绩，数学成绩，英语成绩举例：林青電，98，99，100

    思路：
        1：定义学生类
        2：创建 TreeSet集合，通过比较器排序进行排序
        3：键盘录人学生数据
        4：创建学生对象，把键盘录入的数据对应赋值给学生对象的成员变量
        5：把学生对家添加到Treeset集合
        6：创建宇符緩冲输出流对象
        7：遍历集合，得到每一个学生对象
        8：把学生对象的数据拼接成指定格式的字符串
        9：调用字符缓冲输出流对象的方法写数据
        10：释放资源
 */
public class TreeSetToFileDemo {
    public static void main(String[] args) {
        //2：创建 TreeSet集合，通过比较器排序进行排序
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //成绩总分从高到低
                int num = s2.getTotal_Score() - s1.getTotal_Score();
                //次要条件
                int num2 = num==0? s1.getChinese_Score()-s2.getChinese_Score():num;
                int num3 = num2==0? s1.getMath_Score() -s2.getMath_Score():num2;
                int num4 = num3==0? s1.getName().compareTo(s2.getName()) :num3;

                return num4;
            }
        });
    }
}
