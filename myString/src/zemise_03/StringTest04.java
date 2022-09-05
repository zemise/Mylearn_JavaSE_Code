package zemise_03;

/*
    需求：
        定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回
        调用该方法，并在控制台输出结果
        例如：数组为int[] arr ={1,2,3};执行方法后的输出结果是：[1,2,3]

    思路：
        1、定义一个int类型的数组，用静态初始化完成数组元素的初始化
        2、定义一个方法，用于把int数组中的数据使用指定格式拼接成一个字符串返回
            返回值的类型是：String，参数列表int[] arr
        3、在方法中遍历数组，按照要求进行拼接
        4、调用方法，用一个变量接收结果
        5、输出结果
 */
public class StringTest04 {
    public static void main(String[] args) {
        //定义一个int类型的数组，用静态初始化完成数组元素的初始化
        int[] arr = {1, 2, 3};

        //调用方法，用一个变量接收结果
        String s = arraryToString(arr);

        //输出结果
        System.out.println("s: " +s);

    }

    //定义一个方法，用于把int数组中的数据使用指定格式拼接成一个字符串返回
    //            返回值的类型是：String，参数列表int[] arr
    public static String arraryToString(int[] arr) {
        //在方法中遍历数组，按照要求进行拼接
        String s = "";

        s += "[";
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                s+= arr[i];

            }else{

                s+= arr[i] + ", ";

            }
        }
        s += "]";
        return s;
    }
}
