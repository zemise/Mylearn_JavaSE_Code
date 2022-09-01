package zemise_;
/*
    需求：
        设计一个方法，用于比较两个数组的内容是否相同

    思路：
        1、定义两个数组，分别使用静态初始化完成数组元素的初始化
        2、定义一个方法，用于比较两个数组的内容是否相同
        3、比较两个数组的内容是否相同
            首先，比较数组长度，长度不一，返回false
            其次遍历，比较两个数组中的每一个元素，只要有元素不相同，返回false
            最后，循环遍历结束后，返回true
        4、调用方法，用变量接收
        5、输出结果
 */

public class Test07 {
    public static void main(String[] args) {
        //定义两个数组，分别使用静态初始化完成数组元素的初始化
        int[] arr = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44, 55};

        System.out.println(compare(arr, arr2));

    }

    //定义一个方法，用于比较两个数组的内容是否相同
    public static boolean compare(int[] arr, int[] arr2) {
        //首先，比较数组长度，长度不一，返回false
        if (arr.length != arr2.length) {
            //System.out.println("两个数组内容不相同");
            return false;
        } else {
            //其次遍历，比较两个数组中的每一个元素，只要有元素不相同，返回false
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr2[i]) {
                    //System.out.println("两个数组内容不相同");
                    return false;
                }
            }
            //System.out.println("两个数组内容相同");
            return true;
        }
    }
}



