package zemise_01;

import java.io.File;

/*
    File：文件和目录路径名的抽家表示
        1：文件和目录是可以通过FiLe封装成对象的
        2：对于FiLe而言，其封装的并不是—个真正存在的文件，仅仅是一个路径名而己。它可以是存在的，也可以是不存在的。
            将来是要通过具体的操作把这个路径的内容转换为具体存在的

    构造方法：
        FiLe(String pathname)：通过将给定的路径名字符串转换为抽象路径名来创建新的 FiLe实例，
        File(String parent， String child)：从父路径名字行串和子路径名字符串创建新的 File实例。
        File(File parent， String chiLd)：从父抽象路径名和子路径名字符串创建新的 FiLe实例。
 */
public class FileDemo {
    public static void main(String[] args) {
        //FiLe(String pathname)：通过将给定的路径名字符串转换为抽象路径名来创建新的 FiLe实例
        File f1 = new File("/Users/Downloads/java.txt");
        System.out.println(f1);

        // File(String parent， String child)：从父路径名字行串和子路径名字符串创建新的 File实例。
        File f2 =new File("/Users/Downloads","java.txt");
        System.out.println(f2);

        // File(File parent， String chiLd)：从父抽象路径名和子路径名字符串创建新的 FiLe实例。
        File f3 = new File("/Users/Downloads");
        File f4 = new File(f3,"java.txt");
        System.out.println(f4);
    }
}
