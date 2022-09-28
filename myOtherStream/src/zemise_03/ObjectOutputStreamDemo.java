package zemise_03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/*
    对象序列化流
        构造方法:
            ObjectOutputStream (OutputStream out):创建一个写入指定的OutputStream的ObjectOutputStream

        序列化对象的方法:
            void WriteObject (Object obj):将指定的对象写入ObjectOutputStream


       NotSerializableException:
            抛出一个实例，需要一个Serializable接口
            序列化运行的或实例的类可能会抛出此异常

            类的序列化由实现java.io.serializable接口的类启用
            不实现此接口的类将不会使任何状态序列化或反序列化

 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //ObjectOutputStream (OutputStream out):创建一个写入指定的OutputStream的ObjectOutputStream
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myOtherStream/oos.txt"));

        //创建对象
        Student s = new Student("林青霞",30);

        //void WriteObject (Object obj):将指定的对象写入ObjectOutputStream
        oos.writeObject(s);

        //释放资源
        oos.close();


    }
}
