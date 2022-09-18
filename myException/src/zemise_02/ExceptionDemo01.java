package zemise_02;

/*
    JVM默认处理方案

    try{
        可能出现的异常的代码；
    }catch(异常类名，变量名){
        异常的处理的代码;
    }

    public String getMessage();返回此throwable的详细消息字符串
    public String toString();返回此可抛出的简短描述
    public void printStackTrace();把异常的错误信息输出在控制台
 */
public class ExceptionDemo01 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method() {
        try {
            int[] arr = {1, 2, 3};
//        System.out.println(arr[1]);
            System.out.println(arr[13]);// new ArrayIndexOutOfBoundsException("xxx");
        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("你访问的数组的索引不存在");
            //异常的错误信息输出在控制台
//            e.printStackTrace();

            //返回此throwable的详细消息字符串
//            System.out.println(e.getMessage());

            //public String toString();返回此可抛出的简短描述
//            System.out.println(e.toString());

            //public void printStackTrace();把异常的错误信息输出在控制台
            e.printStackTrace();

        }
    }

}

/*
    开始
    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 3
	    at zemise_02.ExceptionDemo01.method(ExceptionDemo01.java:16)
	    at zemise_02.ExceptionDemo01.main(ExceptionDemo01.java:8)

 */

/*
    public class Throwable{

        private String detailMessage;

        public Throwable(String message){
            detailMessage = message;
        }
        public String getMessage(){
            return detailMessage;
        }
    }
 */