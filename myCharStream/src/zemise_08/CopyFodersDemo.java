package zemise_08;
/*
    需求：
        把"/Users/Shared/IDEA_zemise"复制到"myCharStream"目录下

    思路：
        1：创建数据源File对象，路径是"/Users/Shared/IDEA_zemise"
        2：创建目的地FiLe对象，路径是"myCharStream"
        3：与方法实现文件夹的复制，参数为数据源FiLe对象和目的地FiLe对象
        4：判断数据源File是否是目录
            是：
                A：在自的地下创建和数据源Fie名称一样的目录
                B：获取数据源FiLe下所有文件或者目录的FLe数组
                C：週历该FiLe数组，得到每一个File对象
                D：把该File作为数据源FiLe对象，递归调用复制文件夹的方法
            不是：说明是文件，直接复制，用字节流
 */
public class CopyFodersDemo {
    public static void main(String[] args) {

    }
}
