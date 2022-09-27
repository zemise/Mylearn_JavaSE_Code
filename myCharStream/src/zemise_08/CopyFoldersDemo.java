package zemise_08;

import java.io.*;

/*
    需求：
        把"/Users/Shared/IDEA_zemise"复制到"myCharStream"目录下

    思路：
        1：创建数据源File对象，路径是"/Users/Shared/IDEA_zemise"
        2：创建目的地FiLe对象，路径是"myCharStream"
        3：写方法实现文件夹的复制，参数为数据源FiLe对象和目的地FiLe对象
        4：判断数据源File是否是目录
            是：
                A：在目的地下创建和数据源File名称一样的目录
                B：获取数据源FiLe下所有文件或者目录的File数组
                C：週历该File数组，得到每一个File对象
                D：把该File作为数据源FiLe对象，递归调用复制文件夹的方法
            不是：说明是文件，直接复制，用字节流
 */
public class CopyFoldersDemo {
    public static void main(String[] args) throws IOException {
        //1：创建数据源File对象，路径是"/Users/Shared/IDEA_zemise"
        File sFile = new File("/Users/Shared/IDEA_zemise");

        //2：创建目的地FiLe对象，路径是"myCharStream"
        File dFile = new File("myCharStream");

        //3：写方法实现文件夹的复制，参数为数据源FiLe对象和目的地FiLe对象
        copyFolder(sFile,dFile);

    }
    //复制文件夹
    private static void copyFolder(File sFile, File dFile) throws IOException {
        //判断数据源File是否是目录
        if(sFile.isDirectory()){
            //A：在目的地下创建和数据源File名称一样的目录
            String sourceFileName = sFile.getName();
            File newFolder = new File(dFile,sourceFileName);
            if(!newFolder.exists()){
                newFolder.mkdir();
            }

            //B：获取数据源FiLe下所有文件或者目录的File数组
            File[] fileArray = sFile.listFiles();
            for(File file:fileArray){
                //把该File作为数据源File对象，递归调用复制文件夹的方法
                copyFolder(file,newFolder);
            }

        }else{
            //说明是文件，直接复制，用字节流
            File newFile = new File(dFile,sFile.getName());
            copyFile(sFile,newFile);
        }
    }

    //字节缓冲流复制文件
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
