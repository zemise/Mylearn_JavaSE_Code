package zemise_06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
    需求：
        把ArrayList集合中的学生数据写入到文本文件。要求，每一个学生对象的数据作为文件中的一行数据
        格式：学号，姓名，年龄，居住地
        举例：zemise_001，林青霞，30，西安

   思路：
        1：定义学生类
        2：创建ArroyList集合
        3：创建学生对象
        4：把学生对象添加到集合中
        5：创建字符缓冲输出流对象
        6：遍历集合，得到每一个学生对象
        7：把学生对象的数据拼接成指定格式的字符串
        8：调用字符緩冲输出流对家的方法写数据
        9：释放资源
 */
public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {
        //2：创建ArroyList集合
        ArrayList<Student> arrayList = new ArrayList<>();

        //3：创建学生对象
        Student s1 = new Student("zemise_001","风清扬",22,"北京");
        Student s2 = new Student("zemise_002","令狐冲",23,"南京");
        Student s3 = new Student("zemise_003","郭靖",24,"西安");
        Student s4 = new Student("zemise_004","郭襄",25,"陕西");
        Student s5 = new Student("zemise_005","东方不败",26,"厦门");

        //4：把学生对象添加到集合中
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        arrayList.add(s5);

        //5：创建字符缓冲输出流对象
        BufferedWriter br = new BufferedWriter(new FileWriter("myCharStream/student.txt"));

        //6：遍历集合，得到每一个学生对象
        for (Student s : arrayList){
            // 7：把学生对象的数据拼接成指定格式的字符串
            StringBuilder info = new StringBuilder();
            info.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
//            String info = s.getId() + "," + s.getName() + "," + s.getAge() + "," + s.getAddress();
            //8：调用字符緩冲输出流对家的方法写数据
            br.write(info.toString());
//            br.write(s.toString());
            br.newLine();
            br.flush();
        }

        //9：释放资源
        br.close();

    }
}
