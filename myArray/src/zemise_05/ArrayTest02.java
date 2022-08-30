package zemise_05;

/*
    获取最值
        获取数组中的最大值
        最小值
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {12, 45, 98, 73, 60};

        //定义一个变量，用于保存最大值

        int max;

        //取数组中第一个数据作为变量的初始值
        max = arr[0];

        //循环结束后打印变量的值
        for (int i = 1; i <= (arr.length - 1); i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("最大值为" + max);
    }
}
