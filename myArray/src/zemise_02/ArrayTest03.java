package zemise_02;

public class ArrayTest03 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = new int[3];
        arr[0] = 100;
        arr[1] =200;
        arr[2]= 300;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //再定义一个数组，指向第一个数组
        int[] arr2 = arr;
        arr2[0] = 111;
        arr2[1]=222;
        arr2[2]=333;

        //输出两个数组名及各元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr2);
        System.out.println(arr2[0]);
    }
}
