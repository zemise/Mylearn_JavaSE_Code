package zemise_01;

import java.io.File;
import java.io.IOException;

/*
    File类的判断和获取功能:

public boolean isDirectory():测试此抽象路径名表示的FiLe是否为目录
pubLic boolean isFile():测试此抽象路径名表示的FiLe是否为文件
public boolean exists(): 测试此抽象路径名表示的File是否存在

public String getAbsolutePath():返回此抽象路径名的绝对路径名字符串
public string getPath(),将此抽象路径名转换为路径名字符串
public Stming getName):返回由此抽象路径名表示的文件或目录的名称

public String[] list():返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
public FiLel[] listFiles():返回此抽家路径名表示的目录中的文件和目录的FiLe对象数组
 */
public class FileDemo03 {
    public static void main(String[] args) throws IOException {
        //创建一个File对象
        File f1 = new File("myFile/java.txt");
        System.out.println(f1.createNewFile());

//        public boolean isDirectory():测试此抽象路径名表示的FiLe是否为目录
        System.out.println(f1.isDirectory());
//        pubLic boolean isFile():测试此抽象路径名表示的FiLe是否为文件
        System.out.println(f1.isFile());
//        public boolean exists(): 测试此抽象路径名表示的File是否存在
        System.out.println(f1.exists());
        System.out.println("======================================");

//        public String getAbsolutePath():返回此抽象路径名的绝对路径名字符串
        System.out.println(f1.getAbsolutePath());

//        public string getPath(),将此抽象路径名转换为路径名字符串
        System.out.println(f1.getPath());

//        public Stming getName):返回由此抽象路径名表示的文件或目录的名称
        System.out.println(f1.getName());
        System.out.println("======================================");


        File f2 = new File("/Users/Shared/IDEA_zemise");
//        public String[] List():返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
        String[] list = f2.list();
        for(String s:list){
            System.out.println(s);
        }
//        public FiLel[] ListFiles():返回此抽家路径名表示的目录中的文件和目录的FiLe对象数组
        File[] files = f2.listFiles();
        for(File file:files){
//            System.out.println(file);
//            System.out.println(file.getName());
            if(file.isFile()){
                System.out.println(file.getName());
            }
        }
    }
}
