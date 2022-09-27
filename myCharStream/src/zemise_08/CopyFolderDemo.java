package zemise_08;

import java.io.*;

/*
    需求：
        把user/shared/IDEA_zemise这个文件夹复制到模块目录下

    思路：
        1：创建数据源目录File对象，路径是user/shared/IDEA_zemise
        2：获取效据源目录FiLe对象的名称(Idea_zemise）
        3：创建目的地目录FiLe对象，路径名是模块名 + Idea_Zemise组成(myCharStream/IDEA_zemise)
        4：判断目的地目录对应的FiLe是否存在，如果不存在，就创建
        5：获取数据源目录下所有文件的File数组
        6：遍历File数组，得到每一个File对象，该FiLe对象，其实就是数据源文件数数据源文件：IDEA_zemise/mn.jpg
        7：获取数据源文件FiLe对家的名称(mn.jpg)
        8：创建目的地文件FiLe对象，路径名是目的地目录 + mn.jpg组成(myCharStream/IDEA_zemise/mn.jpg)
        9：复制文件
            由于文件不仅仅是文本文件，还有图片，视颍等文件，所以采用字节流复制文件
 */
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        //1：创建数据源目录File对象，路径是user/shared/Idea_zemise
        File srcFolder = new File("/Users/Shared/IDEA_zemise");

        //2：获取效据源目录FiLe对象的名称(Idea_zemise）
        String srcFolderName = srcFolder.getName();

        //3：创建目的地目录FiLe对象，路径名是模块名 + Idea_Zemise组成(myCharStream/Idea_zemise)
        File destinationFolder = new File("myCharStream", srcFolderName);

        //4：判断目的地目录对应的FiLe是否存在，如果不存在，就创建
        if (!destinationFolder.exists()) {
            destinationFolder.mkdir();
        }

        //5：获取数据源目录下所有文件的File数组
        File[] listFiles = srcFolder.listFiles();

        //6：遍历File数组，得到每一个File对象，该FiLe对象，其实就是数据源文件数数据源文件：IDEA_zemise/mn.jpg
        for (File file : listFiles) {
            if (file.isFile()) {
                //7：获取数据源文件FiLe对家的名称(mn.jpg)
                String fileName = file.getName();
                //8：创建目的地文件FiLe对象，路径名是目的地目录 + mn.jpg组成(myCharStream/IDEA_zemise/mn.jpg)
                File destinFile = new File(destinationFolder, fileName);

                copyFile(file, destinFile);

                //暂时不清楚多级文件夹该怎么递归
            } else if (file.isDirectory()) {

            }
        }

    }
    //9：复制文件
    //   由于文件不仅仅是文本文件，还有图片，视颍等文件，所以采用字节流复制文件
    public static void copyFile(File sourceFile, File destinationFile) throws IOException {

        BufferedInputStream source = new BufferedInputStream(new FileInputStream(sourceFile));
        BufferedOutputStream destination = new BufferedOutputStream(new FileOutputStream(destinationFile));


        byte[] bys = new byte[1024];
        int len;
        while ((len = source.read(bys)) != -1) {
            destination.write(bys, 0, len);
        }

        destination.close();
        source.close();
    }
}
