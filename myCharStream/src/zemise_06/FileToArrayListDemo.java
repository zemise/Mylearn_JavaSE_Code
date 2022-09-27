package zemise_06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/*
    需求：把文本文件中的数据读取到集合中，并遍历集合。要求：文件中每一行数据是一个学生对象的成员变量值
        举例：zemise_001，林青霞，30，西安

    思路：
        1：定义学生类
        2：创建字符缓冲输入流对象
        3：创建ArrayList集合对象
        4：调用字符緩冲输入流对象的方法读数据
        5：把读取到的字符串数据用split()进行分割，得到一个字符串数组
        6：创建学生对象
        7：把字符串数组中的每一个元素取出来对应的赋值给学生对象的成员变量值
        8：把学生对象添加到集合
        9：释放资源
        10；遍历集合
 */
public class FileToArrayListDemo {
    public static void main(String[] args) throws IOException {
        //2：创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("myCharStream/student.txt"));

        //3：创建ArrayList集合对象
        ArrayList<Student> arrayList = new ArrayList<>();

        //4：调用字符緩冲输入流对象的方法读数据
        String line;
        while ((line = br.readLine()) != null) {
            //5：把读取到的字符串数据用split()进行分割，得到一个字符串数组
            String[] srtArray = line.split(",");

            //6：创建学生对象
            Student s = new Student();

            //7：把字符串数组中的每一个元素取出来对应的赋值给学生对象的成员变量值
            s.setId(srtArray[0]);
            s.setName(srtArray[1]);
            s.setAge(Integer.parseInt(srtArray[2]));
            s.setAddress(srtArray[3]);

            //8：把学生对象添加到集合
            arrayList.add(s);

        }
        //9：释放资源
        br.close();

        //10；遍历集合
        for(Student s :arrayList){
            StringBuilder sb = new StringBuilder();
            sb.append("ID: ").append(s.getId()).append(", Name: ").append(s.getName()).append(", Age: ").append(s.getAge()).append(", Address:").append(s.getAddress());
            System.out.println(sb.toString());
        }

    }
/*    //试图创建一个传入字符串数组和ArrayList集合，将字符作为学生对象传入集合中
    public void strToArrayList(String[] s, ArrayList arrayList) {
        for (String str : s) {
            Student st = new Student();
            st.setId(str);
        }

        s.
    }*/
}
