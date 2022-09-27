package zemise_09;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
    复制文件加入异常处理
 */
public class CopyFileDemo {
    public static void main(String[] args) {

    }


    //抛出处理   JDK9改进方案
    private static void method04() throws IOException {
        FileReader fr = new FileReader("fr.txt");
        FileWriter fw = new FileWriter("fw.txt");
        try (fr; fw) {
            char[] chs = new char[1024];
            int len;
            while ((len = fr.read()) != 0) {
                fw.write(chs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //抛出处理   JDK7改进方案
    private static void method03() {
        try (FileReader fr = new FileReader("fr.txt");
             FileWriter fw = new FileWriter("fw.txt");) {
            char[] chs = new char[1024];
            int len;
            while ((len = fr.read()) != 0) {
                fw.write(chs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //tay...catch...finally
    //抛出处理
    private static void method02() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("fr.txt");
            fw = new FileWriter("fw.txt");

            char[] chs = new char[1024];
            int len;
            while ((len = fr.read()) != 0) {
                fw.write(chs, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //抛出处理
    private static void method01() throws IOException {
        FileReader fr = new FileReader("fr.txt");
        FileWriter fw = new FileWriter("fw.txt");

        char[] chs = new char[1024];
        int len;
        while ((len = fr.read()) != 0) {
            fw.write(chs, 0, len);
        }

        fw.close();
        fr.close();
    }
}
