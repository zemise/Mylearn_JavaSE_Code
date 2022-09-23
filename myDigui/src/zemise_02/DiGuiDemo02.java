package zemise_02;

import java.io.File;

/*
    需求：
         需求：给定一个路径(/Users/Shared)，请通过递归完成遍历该目录下的所有内容，并把所有文件的绝对路径输出在控制台

    思路：
        1：根据给定的路径创建一个File对象
        2：定义一个方法，用于获取给定目录下的所有内容，参数为第1步创建的FiLe对象
        3：获取给定的File目录下所有的文件或者目录的File数组
        4：遍历该File数组，得到每一个File对象
        5：判断该File对象是否是目录
            是：递归调用
            不是：获取绝对路径输出在控制台
        6：调用方法
 */
public class DiGuiDemo02 {
    public static void main(String[] args) {
        //1：根据给定的路径创建一个File对象
        File file = new File("/Users/Shared");

        //6：调用方法
        System.out.println(getFile(file));
    }
    //2：定义一个方法，用于获取给定目录下的所有内容，参数为第1步创建的FiLe对象

    public static String getFile(File file){
        //3：获取给定的File目录下所有的文件或者目录的File数组
        File[] files = file.listFiles();
        //4：遍历该File数组，得到每一个File对象
        String absolutePath = "";
        for(File f :files){
           //5：判断该File对象是否是目录
            if(f.isDirectory()){
                //是：递归调用
                return getFile(f);
            }else{
                absolutePath = f.getAbsolutePath();
            }

        }
    }
}
