package zemise_01;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.IOException;

/*
    File类创建功能：
        public boolean createNewFile()：当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
        如果文件不存在，就创建文件，并返回true
        如果文件存在，就不创建文件，返回false

        public boolean mkdir()：创建由此抽象路径名命名的目录
        如果目录不存在，就创建目录，并返回true
        如果目录存在，就不创建目录，返回false

        public boolean mkdirs()：创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录
        如果目录不存在，就创建目录，并返回true
        如果目录存在，就不创建目录，返回false

 */
public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        //需求1:我要在/Users/Shared/IDEA_zemise目录下创建一个文件java.txt
        File f1 =new File("/Users/Shared/IDEA_zemise/java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("===================");

        //需求2:我要在/Users/Shared/IDEA_zemise目录下创建一个目录 JavaSE
        File f2 = new File("/Users/Shared/IDEA_zemise/javaSE");
        System.out.println(f2.mkdir());
        System.out.println("===================");

        //需求3:我要在/Users/Shared/IDEA_zemise目录下创建一个多级目录JavaMEBI/HTML
        File f3 = new File("/Users/Shared/IDEA_zemise/javaMEBI/HTML");
        System.out.println(f3.mkdirs());
        System.out.println("===================");

        //需求4:我要在/Users/Shared/IDEA_zemise目录下创建一个文件javase.txt
        File f4 =new File("/Users/Shared/IDEA_zemise/javase.txt");
//        System.out.println(f4.mkdir());
        System.out.println(f4.createNewFile());
    }

}
