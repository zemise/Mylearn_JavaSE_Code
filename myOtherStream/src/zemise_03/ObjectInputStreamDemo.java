package zemise_03;

import java.io.*;

/*
    构造方法:
        ObjectInputStream (InputStream in):创建从指定的InputStream读取的ObjectInputStream

    反序列化对象的方法:
        Object ReadObject (: MObjectInputStream读取一个对象
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myOtherStream/oos.txt"));

        Object obj = ois.readObject();

        Student s = (Student) obj;
        System.out.println(s.getName() + "," + s.getAge());

        ois.close();

    }
}
