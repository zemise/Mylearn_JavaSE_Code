package zemise_01;

import java.io.File;
import java.io.IOException;

/*
    File类册除功能：
        public boolean delete()：删除由此抽象路径名表示的文件或目录
 */
public class FileDemo04 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("myFile/java.txt");

        //public boolean delete()：删除由此抽象路径名表示的文件或目录
        //需求1： 在当前模块目录下创建java.txt文件
        System.out.println(f1.createNewFile());

        //需求2：在当前模块目录下删除Java.txt文件
        System.out.println(f1.delete());

        //需求3：在当前目录下创建zemise_目录
        File f2 = new File("myFile/src/zemise_");
        System.out.println(f2.mkdir());

        //需求4：在当前目录下删除zemise_目录
        System.out.println(f2.delete());

        System.out.println("====================");
        //需求5：在当前模块下创建一个目录zemise_，然后在该目录下创建一个文件java.txt
        File f3 = new File("myFile/zemise_");
        System.out.println(f3.mkdirs());

        File f4 = new File("myFile/zemise_/java.txt");
        System.out.println(f4.createNewFile());

        //需求6：删除当前模块下的目录zemise_
        System.out.println(f4.delete());
        System.out.println(f3.delete());

    }
}
