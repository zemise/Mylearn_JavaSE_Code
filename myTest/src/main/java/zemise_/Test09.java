package zemise_;

/*
    需求：
        已知一个数组arr[19,28,37,46,50];用程序实现把数组中的元素值交换
        交换后的数组arr[50,46,37,28,19];并在控制台输出交换后的数组元素
    思路：
        1、定义一个数组，用静态初始化完成数组元素的初始化
        2、循环遍历数组，这一次初始化语句定义两个索引变量，判断条件是开始索引小于等于结束索引
        3、变量交换
        4、遍历数组
 */
public class Test09 {
    public static void main(String[] args) {
        //定义一个数组，用静态初始化完成数组元素的初始化
        int[] arr = {19, 28, 37, 46, 5};

        //循环遍历数组，这一次初始化语句定义两个索引变量，判断条件是开始索引小于等于结束索引

/*        for (int start = 0, end = arr.length - 1; start<=end; start++,end--){
            //变量交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;*/

        //利用定义的reverse方法进行倒序
        reverse(arr);
        //输出倒序后的数组
        printArrary(arr);
    }


    //定义一个反转数组的方法reverse()
    public static void reverse(int[] arr) {
        //循环遍历数组，这一次初始化语句定义两个索引变量，判断条件是开始索引小于等于结束索引
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            //变量交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    //定义一个输出数组的方法printArray()
    public static void printArrary(int[] arr){

        System.out.print("[");
        for(int i =0;i< arr.length;i++){
            //先判断该数组只含有一个元素的情况
            if(i == arr.length -1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }
}
